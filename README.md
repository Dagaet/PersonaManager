# PersonaManager
___
#### Ejercicio de clase 
##### En este ejercicio se requería lo siguiente:
1. Crea un nuevo proyecto denominado PersonaManager
2. Implementa una clase de tipo persona. Incluye en ella, como mínimo, los siguientes atributos: Nombre, apellidos, año de nacimiento, edad, DNI y correo electrónico.
3. Crea un constructor que acepte como argumentos nombre, apellidos, dni.
4. Crea los métodos de acceso necesarios para tu nueva clase, exceptuando el setter de la edad.
5. Añade un método privado para calcular la edad de una persona restando el año actual a su año de nacimiento. Para ello tendrás que investigar cómo conseguir el año actual del sistema. Te sugiero como recurso, que investigues el siguiente
enlace:
[https://www.w3schools.com/java/java_date.asp]
6. Añade un método privado que permita validar que el DNI que han introducido es un DNI correcto. Necesito que generes un método en la clase persona que devuelva true si el DNI que pasamos como argumento es válido o false en caso contrario.
Para saber cómo se valida un DNI te dejo el siguiente enlace:
[https://www.letranif.com/formula-para-calcular-nif/]
7. En el método main de la clase principal de tu proyecto, instancia un objeto persona utilizando el constructor que has creado y, a continuación, asigna una fecha de nacimiento. Muestra el valor de cada atributo del objeto utilizando los métodos de acceso que has programado.
8. Cambia el nombre y los apellidos de la instancia que has creado utilizando los métodos de acceso que has programado y vuelve a mostrarlos.
9. Haz que el setter que has programado para el atributo dni compruebe si el dni que se intenta añadir es válido. Si es válido, debe actualizar el valor si no lo es, debe mostrar un mensaje de error por pantalla y dejar el valor anterior.
10. Haz que el setter que has programado para el atributo fecha de nacimiento calcule y actualice el valor de la edad.
