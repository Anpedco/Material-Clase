# Ejercicio 2


- Estúdiense los directorios, los ficheros, los paquetes (`package`) indicados y sus relaciones, que cuelgan de este directorio `Ejercicio2`

```
Ejercicio2
├── LEEME.md
├── bin
└── src
    ├── clases
    │   ├── Clase1.java
    │   └── Clase2.java
    └── test
        └── Test.java
```

- Ubíquese (`cd`) en el directorio `src` y compílese (`javac`) el contenido del directorio `test` para que pueda realizarse una compilación 
_voraz_ del contenido del directorio `clases` (similarmente al ejercicio anterior). Todas las clases generadas deberían quedar colgando del directorio `bin` mostrado en el árbol anterior, por lo que habrá que emplear oportunamente el switch `-d`. La intención es conseguir de modo automático con la compilación lo siguiente:


```
Ejercicio2
├── LEEME.md
├── bin
│   ├── clases
│   │   ├── Clase1.class
│   │   └── Clase2.class
│   └── test
│       └── Test.class
└── src
    ├── clases
    │   ├── Clase1.java
    │   └── Clase2.java
    ├── solucion.sh
    └── test
        └── Test.java
```


 

- Sin cambiar de directorio, ejecútese (`java`) la clase que contiene el punto de entrada `main` desde la máquina virtual (es decir, la clase `test.Test`). Para ello deberá emplearse el _switch_ `-cp` indicando el path donde podremos encontrar las clases. 
El resultado de la ejecución debería ser como el que sigue:


```
En programa principal
Creando objeto Clase1
Creando objeto Clase2
Fin programa principal
```	


