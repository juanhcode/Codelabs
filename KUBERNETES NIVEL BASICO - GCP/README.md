# Ip del ingress
34.117.132.88



Pregunta: Que esta ocurriendo con el servicio auth-service?
auth-service-7d84479fb9-xfhqs ya fue creado y el contenedor arrancó, pero la aplicación dentro del contenedor aún no está lista para recibir tráfico, y por eso falla el Readiness Probe.

Esto significa que Kubernetes está haciendo un GET a la URL /actuator/health del contenedor y no está recibiendo respuesta (rechazo de conexión). Como consecuencia:

El pod no es marcado como "Ready".

No recibe tráfico a través del Service ni del Ingress.

El endpoint /actuator/health no existe o Spring Boot no lo expone sin configuración adicional.