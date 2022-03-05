# 2doExamenTHP
Enunciado
El club Amigos Unidos nos solicita desarrollar una aplicación para registrar a todos los socios junto
con su edad. Sabemos que no hay socios con el mismo nombre.
Además cada socio tiene amigos. Si A es amigo de B, entonces también B es amigo de A. Una
persona no puede ser amiga de sí misma.
El programa debe:
● Permitir que se agreguen socios verificando que no estén registrados previamente.
● Permitir que se establezca amistad entre dos socios verificando que no se haya registrado
previamente.
● Permitir que se deshaga una amistad previamente establecida.
Considerar:
● Las amistades siempre son recíprocas.
● Los socios deben sí o sí tener nombre y una edad lógica (si no será ERROR). No hay dos
socios con el mismo nombre.
● Definir cada método con su modificador de acceso (private/public) correspondiente, creando
los métodos auxiliares necesarios en la clase que considere.
● Cargar todos los datos desde una clase Test contemplando los casos posibles de error (son
los que se muestran en la ejecución).
● Crear un Enum llamado Resultado que codifique todos los casos distintos de resultado
posible tales como OK, YA_EXISTE, MISMA_PERSONA, etc. para los métodos de agregar
socios, establecer amistad y deshacer amistad.
● Un listado de todos los socios junto con el nombre de su amigo más joven (se supone único).
● Devolver una colección con el nombre y la edad de los amigos de un socio a partir del
nombre de este último (se ingresa como parámetro). Si no existe ningún socio con ese
nombre devolver null.
Para probar el programa desarrollá la clase Test agregando los casos de prueba que se ven a
continuación. No hace falta que cargues los socios a mano. Es deseable que se haga la validación de
los datos resultantes (chequear si dio lo esperado) pero no es obligatorio.
