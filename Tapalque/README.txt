descargar Docker desktop:

https://www.docker.com/products/docker-desktop/

registrarse

Descargar PostgreSQL:

https://www.enterprisedb.com/downloads/postgres-postgresql-downloads    -->versión 16

Ejecutar instalador. Cuando pida contraseña, colocar 3141592

En el task para bajar mas herramientas (aparece solo después de la instalación) buscar y seleccionar el JDBC. 

Al terminar: en la barra de búsqueda poner pgAdmin y ejecutar. Eso abre la app para crear la base de datos (yo la ancle a la barra de herramientas) 

spring-boot esta configurado para que cree la base de datos solo


IMPORTANTE: tanto la app como la base de datos correrán por los puertos 8080 y 5432 respectivamente. Verificar que los puertos esten libres.

Desde la terminal de comandos colocar:

>> netstat -ano | findstr :8080

>> netstat -ano | findstr :5432

Dara un listado de la aplicación que esta ejecutándose ahí.

Para saber que proceso esta usando el puerto:

>> Get-Process -id <numero del final de la fila>

Ejemplo Get-Process -id 12500

Para eliminarla y liberar el puerto (salvo que sea postgreSQL o la app):

>> taskkill /PID <PID> /F

Donde <PID> se reemplaza por el numero identificador del proceso (el umero que aparece al final, luego de LISTENING)

Ejemplo >> taskill /PID 8008 /F


Una vez abierto el proyecto en el IDE. Click derecho sobre archivo pom.xml y ejecutar desde terminal.

>> mvn clean package -DskipTests

>> mvn install -DskipTests

>> docker-compose build

>> docker-compose up

Si van al la aplicacionde docker descargada, en container le debera aparecer como 'tapalque'

Ingresar desde el navegador a http://localhost:8080

Si aparece este mensaje:

Whitelabel Error Page
This application has no explicit mapping for /error, so you are seeing this as a fallback.

There was an unexpected error (type=Not Found, status=404).

ES PORQUE ESTA FUNCIONANDO BIEN!!

Dejo un endpoint de prueba:

>> http://localhost:8080/saludo




