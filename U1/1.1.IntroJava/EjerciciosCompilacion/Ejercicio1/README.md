# Ejercicio 1


- Estúdiense los directorios, los ficheros, los paquetes (`package`) indicados y sus relaciones, que cuelgan de este directorio `Ejercicio1`

```
Ejercicio1
├── LEEME.md
└── src
    ├── clases
    │   ├── Clase1.java
    │   └── Clase2.java
    └── test
        └── Test.java
```

- Desde una ventana de línea de comandos, ubíquese (`cd`) en el directorio `src` y compílese (`javac`) el fichero `Test.java` ubicado en el directorio `test`, realizando una compilación _voraz_ de todas las clases necesarias (por tanto, generando de forma automática `clases.Clase1` y `clases.Clase2`, según se desprende de las relaciones indicadas entre clases). Todas las clases generadas deberían quedar junto a los fuentes (__no__ debería ser necesario, por tanto, emplear el switch `-d`), quedando el directorio como sigue:


```bash
Ejercicio1
├── LEEME.md
└── src
    ├── clases
    │   ├── Clase1.class
    │   ├── Clase1.java
    │   ├── Clase2.class
    │   └── Clase2.java
    └── test
        ├── Test.class
        └── Test.java
```

	
- Ejecútese (`java`) desde el mismo directorio `src` la clase que contiene el punto de entrada `main` desde la máquina virtual (es decir, según el fichero `Test.java`, la clase se denominaría `test.Test`). El resultado de la ejecución debería ser como el que sigue:


```
En programa principal
Creando objeto Clase1
Creando objeto Clase2
Fin programa principal
```	

Compruébese que si se cambia de directorio, ya no es válida la llamada a `java` realizada.


