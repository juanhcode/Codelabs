## Preguntas y Respuestas sobre Clean Architecture en Microservicios con Spring Boot

**1. ¿Cuál es el propósito principal de Clean Architecture en el desarrollo de software?**  
Separar responsabilidades y mantener el código limpio, flexible y fácil de probar.

**2. ¿Qué beneficios aporta Clean Architecture a un microservicio en Spring Boot?**  
Mejor organización, menos acoplamiento y más facilidad para mantener y escalar.

**3. ¿Cuáles son las principales capas de Clean Architecture y qué responsabilidad tiene cada una?**  
Dominio (reglas), Aplicación (use cases), Infraestructura (tecnología) y Entrada (controllers).

**4. ¿Por qué se recomienda desacoplar la lógica de negocio de la infraestructura en un microservicio?**  
Para que la lógica no dependa de frameworks o bases de datos.

**5. ¿Cuál es el rol de la capa de aplicación y qué tipo de lógica debería contener?**  
Coordina los casos de uso del sistema, no la lógica de negocio pura.

**6. ¿Qué diferencia hay entre un UseCase y un Service en Clean Architecture?**  
UseCase resuelve una necesidad específica; Service suele estar en frameworks y puede mezclar capas.

**7. ¿Por qué se recomienda definir Repositories como interfaces en la capa de dominio en lugar de usar directamente JpaRepository?**  
Para que el dominio no dependa de JPA ni de ninguna tecnología.

**8. ¿Cómo se implementa un UseCase en un microservicio con Spring Boot y qué ventajas tiene?**  
Como una clase independiente; mejora pruebas, claridad y separación.

**9. ¿Qué problemas podrían surgir si no aplicamos Clean Architecture en un proyecto de microservicios?**  
Código enredado, difícil de mantener y con lógica mezclada.

**10. ¿Cómo Clean Architecture facilita la escalabilidad y mantenibilidad en un entorno basado en microservicios?**  
Cada parte está clara y separada, lo que permite crecer sin romper todo.
