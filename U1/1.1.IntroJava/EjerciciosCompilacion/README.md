# Ejercicios de compilación y ejecución de Java


Con esta serie de ejercicios, de realización voluntaria y complejidad creciente, se pretende que el alumno se familiarice con la especificación de parámetros, directorios y ficheros tanto en la compilación como en la ejecución en _línea de comandos_ de software escrito en el lenguaje de programación Java. En cada carpeta (`Ejercicio1`, `Ejercicio2` y `Ejercicio3`) existe un fichero `LEEME.md` que describe las peculiaridades del ejercicio.

Antes, recordemos algunos detalles básicos o mínimos, pero importantes tanto de la identificación de directorios y ficheros como de la compilación y de la ejecución en Java.

## Directorios y ficheros

Recuérdese que los ficheros se determinan en el sistema de archivos de la máquina a partir de un _path_ o camino desde un punto de referencia denominado _raíz_. En sistemas tipo _UNIX_ la raíz es el directorio denominado propiamente _raíz_ `/` y en Windows, típicamente sería `C:\` o la unidad que estemos empleando como referencia.

Por ejemplo el fichero `C:\Usuarios\Pepe\Documentos\dir1\hola1.txt` está perfectamente determinado en el sistema de ficheros a partir de la secuencia de directorios indicada. Esta forma de referenciar un fichero o directorio se suele denominar _absoluta_, ya que se comienza desde la raíz toda la indicación.
En sistemas UNIX/Linux/OS-X un ejemplo parecido podría ser: `/home/pepe/documentos/dir1/hola1.txt`. Obsérvese cómo el separador de directorios es distinto en Windows y en UNIX/LINUX/OS-X (en la ventana de línea de comandos de Git Bash de Windows, el separador es como en UNIX/Linux/OS-X). En todo directorio existen siempre referencias a ciertos _directorios especiales_ como son `../` o `..\` (directorio padre) y `./` o `.\` (el propio directorio).


Alternativamente, un fichero puede identificarse de manera _relativa_ al directorio en el que actualmente se está. 
Por ejemplo, el fichero  `C:\Usuarios\Pepe\Documentos\dir1\dir2\dir3\hola2.txt` podría referenciarse  desde `C:\Usuarios\Pepe\Documentos\dir1` como `dir2\dir3\hola2.txt`. 

El fichero `C:\Usuarios\Pepe\Otro_directorio\dir_x\dir_y\hola3.txt` podría ser referenciado como `..\..\Otro_directorio\dir_x\dir_y\hola3.txt` desde  `C:\Usuarios\Pepe\Documentos\dir1` ya que:

- Estamos en `C:\Usuarios\Pepe\Documentos\dir1` tomándolo como referencia
- Analizando `..\..\Otro_directorio\dir_x\dir_y\hola3.txt`, deducimos que:
    - El primer `..\` nos ubicaría _arriba_ (directorio padre) de  la referencia `C:\Usuarios\Pepe\Documentos\dir1`, es decir, en `C:\Usuarios\Pepe\Documentos`
    - El siguiente `..\` nos ubicaría en `C:\Usuarios\Pepe\`
    - A continuación, el resto `Otro_directorio\dir_x\dir_y\` haría que nos ubicásemos en el directorio que contiene ya a `hola3.txt`.


Recuérdese que con el comando `cd DIR` _(change directory)_ podemos cambiar al un directorio destino `DIR` (sea este absoluto o relativo), por ejemplo:

   - `cd C:\Usuarios\Pepe\Desktop` (cambio a directorio absoluto)
   - `cd ..\..\dir1` (cambio a directorio relativo)


## Compilación


Recuérdese que la compilación, llevada a cabo en línea de comandos por `javac`, puede contemplar, entre otras, las siguientes opciones (ejecútese `javac -help` para ver un detalle de todas las opciones, o bien visítese [javac](https://docs.oracle.com/javase/7/docs/technotes/tools/windows/javac.html) de Oracle para estudiarlo con mayor profundidad):

- `-d DIR`: donde `DIR` indica dónde se ubicarán (de forma estructurada según la definición de la directiva `package` encontrada potencialmente en el fichero a compilar, en forma de subpaquetes&mdash;subdirectorios)  las clases o ficheros `.class` resultantes de la compilación. Si no se especifica este _switch_, los ficheros `.class` se dejarán en el mismo directorio que los fuentes `.java` de los que se derivan.
- `-cp DIR` o `-cp FICH_JAR` o secuencias de ambos conceptos (`-cp DIR_1<sep>DIR_2<sep>F1.jar<sep>DIR_3<sep>F2.jar...`), es decir, directorios o ficheros `.jar` que contienen las clases necesarias para verificar que la compilación en cuestión es sintácticamente correcta.
(`<sep>` es un carácter separador utilizado para separar cada uno de estos directorios o ficheros `.jar` y que en la ventana de comandos de Windows es `;`, en Linux/OS-X es `:` y en la ventana de comandos de Git-Bash de Windows es `";"` &mdash;inclúyase las comillas&mdash;.)
- `-sourcepath DIR`: indica dónde buscar ficheros fuente `.java` para compilarlos generando las clases necesarias no encontradas en los _sitios_ indicados por `-cp` (por ello conviene nombrar los ficheros `.java` con el mismo nombre que la clase que contiene; de esta forma,  el compilador podrá identificar de forma inmediata qué ficheros debe compilar). Dentro del directorio indicado `DIR`, se debería haber  respetado la secuencia de subdirectorios en función de la secuencia de subpaquetes del nombre _cualificado_ de la clase (nombre de clase con el paquete al que pertenece como prefijo).


Por ejemplo, si las primeras líneas del fichero  `Fichero.java` ubicado en cierto directorio `dir1`, fueran:

```java
package paquete;
import paq.subpaq.subpaq1.Clase;
...
```

Entonces

```bash
javac -d dir\bin -cp DIR_CLASES;.;..\dirx\lib.jar -sourcepath fuentes dir1\Fichero.java
```

compila `dir1\Fichero.java` produciendo al final, si es posible, `dir\bin\paquete\Fichero.class`. Como la compilación de `dir1\fichero.java` requiere conocer los detalles de ciertas clases para verificar que todo es sintácticamente correcto (como por ejemplo la clase `paq.subpaq.subpaq1.Clase`), entonces estas clases (ficheros `.class` correspondientes) se buscarán en el directorio `DIR_CLASES` o en el directorio actual `.` o en el fichero .jar `..\dirx\lib.jar`, y si no se encuentran,  se buscarán, ya no los ficheros `.class` sino los fuentes `.java` (fichero `fuentes\paq\subpaq\subpaq1\Clase.java` en este caso) y si existen, se compilan (quedando en esta caso concreto la clase generada &mdash;fichero `.class`&mdash; en `dir\bin\paq\subpaq\subpaq1\Clase.class`). Este esquema de compilación es el que podemos denominar como compilación _voraz_.

Si no se especifican los _switches_ `-cp` ni `-sourcepath`, hay un valor por defecto para `-sourcepath` que es `-sourcepath .`; si se especifica `-cp` ya no hay ningún valor de `-sourcepath` por defecto y obligatoriamente habría que indicar un valor para `-sourcepath` si fuera necesario.


## Ejecución

Para la ejecución (con `java`, es decir, la _máquina virtual Java_) se contempla entre otras las siguientes opciones:

-  `-cp DIRECTORIO` o `-cp FICHERO_JAR` o secuencias de ambos conceptos (`-cp DIR_1<sep>DIR_2<sep>F1.jar<sep>DIR_3<sep>F2.jar...`): misma finalidad que en compilación, pero esta vez, no para verificar nada sintácticamente, sino para emplear propiamente las clases.

Ejemplo:

```
java -cp ..\bin;libreria1.jar;clases\especiales;dir2\dir3;. paquete.ClaseMain

```

Con lo cual se ejecuta la clase `ClaseMain` &mdash;recuérdese que arranca con el _entry point_, es decir, el método `public static void main(String[] args)`&mdash; perteneciente al paquete `paquete`, es decir, se ejecuta la clase `paquete.ClaseMain` y esta (fichero `ClaseMain.class`) será buscada en todos los sitios indicados por `-cp`; es decir, debería existir o bien `..\bin\paquete\ClaseMain.class` o bien dentro de `libreria1.jar` debería existir `paquete\ClaseMain.class` o bien debería existir `clases\especiales\paquete\ClaseMain.class` o bien `dir2\dir3\paquete\ClaseMain.class` o bien `paquete\ClaseMain.class` (que sería lo mismo que `.\paquete\ClaseMain.class`), atendiendo a la secuencia de directorios/ficheros `.jar` separados por, en este caso, `;` especificados en el _switch_ `-cp`. El resto de clases involucradas en la aplicación Java será buscado en los mismos sitios indicados.



## Resultados

Anótese en un fichero de texto en cada ejercicio, la secuencia de comandos que permiten la ubicación en los directorios indicados, la compilación y la ejecución de las pruebas. Consúltese con los profesores de la asignatura cualquier duda al respecto.

