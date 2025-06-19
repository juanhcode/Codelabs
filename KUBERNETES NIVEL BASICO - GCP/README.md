# Ip del ingress
34.117.132.88



Pregunta: Que esta ocurriendo con el servicio auth-service?
auth-service-7d84479fb9-xfhqs ya fue creado y el contenedor arrancó, pero la aplicación dentro del contenedor aún no está lista para recibir tráfico, y por eso falla el Readiness Probe.

Esto significa que Kubernetes está haciendo un GET a la URL /actuator/health del contenedor y no está recibiendo respuesta (rechazo de conexión). Como consecuencia:

El pod no es marcado como "Ready".

No recibe tráfico a través del Service ni del Ingress.

El endpoint /actuator/health no existe o Spring Boot no lo expone sin configuración adicional.



# 🔴 Resumen de Fallos

## `auth-service`

📌 **Problema principal**: `CrashLoopBackOff`

📋 **Razón**:
- El contenedor inicia pero se **termina con código de error `1`**, indicando una falla en tiempo de ejecución (por ejemplo: fallo de conexión a base de datos, error de configuración, etc.).
- El `readiness probe` a `/actuator/health` **falla** porque la app no responde en el puerto `8080` (`connection refused`).

🔍 **Probables causas**:
- El microservicio no inicia correctamente por una **falla interna** (revisa logs).
- El `DB_URL` apunta a `db2`, pero este host probablemente **no existe o no es resolvible**.
- El endpoint `/actuator/health` puede **no estar habilitado** o la app **se cae antes de levantar**.

---

## `pais-service`

📌 **Problema principal**: `Running` pero **no `Ready`**

📋 **Razón**:
- El contenedor también **termina con código `1`** (error).
- Falla el `readiness probe` a `/pais-actuator/health` por `connection refused`.

🔍 **Probables causas**:
- Tu aplicación tampoco está escuchando correctamente en el puerto `8080`.
- El endpoint `/pais-actuator/health` **no existe** o no está habilitado.
- El `DB_URL` apunta a `db1`, que también podría **no estar disponible** en el clúster.
