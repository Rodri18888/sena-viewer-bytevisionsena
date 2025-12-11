# ByteVisionSENA

Proyecto académico desarrollado como visor de contenido multimedia y publicaciones.
Incluye gestión de películas, series, libros y revistas, además de un menú interactivo por consola.

## Integrantes del equipo y roles/responsabilidades

Rodrigo: Desarrollador Implementación de las clases Film y Publication, creación del menú interactivo, carga de datos y manejo del repositorio.

Aly: Desarrollador Creación de las clases Movie, Serie y Chapter.

Cesar: Desarrollador Implementación de las clases Magazine y Book.


## Estructura del proyecto

bytevisionsena/
│
├── README.md
├── src/
│   └── edu/
│       └── misena/
│           ├── Main.java
│           └── senaviewer/
│               └── model/
│                   ├── Film.java
│                   ├── Movie.java
│                   ├── Serie.java
│                   ├── Chapter.java
│                   ├── Publication.java
│                   ├── Book.java
│                   └── Magazine.java
│
└── recursos/
    └── diagrama-clases.png

## Diagrama de clases


### Relaciones principales:

Film (Clase padre)
 ├── Movie
 └── Serie

Publication (Clase padre)
 ├── Book
 └── Magazine

Chapter (Clase independiente)

## Instrucciones para compilar y ejecutar
### 1. Requisitos

Java JDK 17 o superior

Un IDE o editor compatible (IntelliJ, Eclipse, VSCode)

Git (opcional)

### 2. Clonar el repositorio
git clone https://github.com/usuario/bytevisionsena.git

### 3. Compilar el proyecto

Si usas terminal:

cd bytevisionsena/src
javac edu/misena/Main.java

### 4. Ejecutar la aplicación
java edu.misena.Main

## Demo del proyecto (Sprint Review)

Flujo general del programa:

Al iniciar se muestra el menú principal:

1. Movies
2. Series
3. Books
4. Magazines
5. Report
6. Report Today
0. Exit


## El usuario puede:

Ver películas y marcarlas como vistas

Ver series

Listar libros

Listar revistas

Generar reportes generales

Generar un reporte del día

Después de cada acción la aplicación regresa al menú principal.

Estado del proyecto

Sprint 1 completado

Clases creadas

Herencia implementada

Menú funcional

Sprint 2 en desarrollo
