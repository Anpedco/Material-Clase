# Ejercicio 3


- Estúdiense los directorios, los ficheros, los paquetes (`package`) indicados y sus relaciones, que cuelgan de este mismo directorio `Ejercicio3`

```
Ejercicio3
├── LEEME.md
├── bin
├── lib
├── otros
│   ├── bin
│   └── src
│       └── masClases
│           └── Clase4.java
└── src
    ├── clases
    │   ├── Clase1.java
    │   ├── Clase2.java
    │   └── Clase3.java
    └── test
        └── Test2.java
```

- Ubíquese (`cd`) en el directorio `otros\src\masClases` y compílese (`javac`) el fichero `Clase4.java`, de modo que el fichero `Clase4.class` quede ubicado de forma automática en el directorio `otros\bin\masClases`, tal y como es muestra en el siguiente árbol de directorios y ficheros (recuérdes que hay que emplear el _switch_ -d para reubicar los ficheros `.class` generados en el directorio oportuno):

```
Ejercicio3
├── bin
├── lib
├── otros
│   ├── bin
│   │   └── masClases
│   │       └── Clase4.class
│   └── src
│       └── masClases
│           └── Clase4.java
└── src
    ├── clases
    │   ├── Clase1.java
    │   ├── Clase2.java
    │   └── Clase3.java
    └── test
        └── Test2.java
```

- A continuación, cámbiese al directorio `otros` y desde ahí, créese el fichero `libreria.jar` (mediante la utilidad `jar` y con los parámetros oportunos) ubicándolo en el directorio `lib` tal y como se muestra a continuación

```
Ejercicio3
├── bin
├── lib
│   └── libreria.jar
├── otros
│   ├── bin
│   │   └── masClases
│   │       └── Clase4.class
│   └── src
│       └── masClases
│           └── Clase4.java
└── src
    ├── clases
    │   ├── Clase1.java
    │   ├── Clase2.java
    │   └── Clase3.java
    └── test
        └── Test2.java
```

El fichero `libreria.jar` debería tener el siguiente contenido verificado mediante el comando ejecutado desde el mismo directorio `otros`

```bash
jar .......  # creación de ../lib/libreria.jar
jar tvf ../lib/libreria.jar
     0 Tue Mar 05 12:46:08 CET 2019 META-INF/
    68 Tue Mar 05 12:46:08 CET 2019 META-INF/MANIFEST.MF
     0 Tue Mar 05 12:39:02 CET 2019 masClases/
   380 Tue Mar 05 12:39:02 CET 2019 masClases/Clase4.class
```


- A continuación, cámbiese al directorio `Ejercicio3` y desde ahí compílese _vorazmente_ `Test2.java` (para ello deberá probablemente emplearse el _switch_ `-sourcepath DIR_SRC` donde `DIR_SRC` es el directorio en el que se encontrarán los ficheros fuente con los que compilar _vorazmente_ las clases necesarias para completar la compilación; también deberá emplearse el _switch_ `-d DIR_CLS`para ubicar las clases generadas en la compilación y ordenadas en directorios a partir del directorio `bin`, atendiendo a los _packages_ definidos en los fuentes).

```
Ejercicio3
├── bin
│   ├── clases
│   │   ├── Clase1.class
│   │   ├── Clase2.class
│   │   └── Clase3.class
│   └── test
│       └── Test2.class
├── lib
│   └── libreria.jar
├── otros
│   ├── bin
│   │   └── masClases
│   │       └── Clase4.class
│   └── src
│       └── masClases
│           └── Clase4.java
└── src
    ├── clases
    │   ├── Clase1.java
    │   ├── Clase2.java
    │   └── Clase3.java
    └── test
        └── Test2.java
```


 

- Sin cambiar de directorio, ejecútese (`java`) la clase que contiene el punto de entrada `main` desde la máquina virtual (es decir, la clase `test.Test`). Para ello deberá emplearse el _switch_ `-cp` indicando el path donde podremos encontrar las clases. 
El resultado de la ejecución debería ser como el que sigue:


```
En programa principal
Creando objeto clases.Clase1
Creando objeto clases.Clase2
Creando objeto clases.Clase3
Creando objeto masClases.Clase4
Fin programa principal
```	


