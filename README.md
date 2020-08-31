# LAB3_ARSW  🚀
**Integrantes:**


* _Angie Daniela Ruiz Alfonso_
* _Juan Sebastian Díaz Salamanca_ 
## Introduction to Spring and Configuration using annotations 🔎
### Parte I Basic workshop
_Spring es un framework para el desarrollo de aplicaciones, el cual usa ciertas notaciones para especificar lo siguiente:_


  * @Autowired: _Se encarga de inyectar la dependencia de objetos implícitamente. Aplica para campos, métodos y constructores. Cuando aplica en campos, pasa los valores para los campos usando el nombre de la propiedad, y Spring se encargará de asignar automáticamente los campos con los valores pasados._
  * @Qualifier: _Se usa en conjunto con @Autowired y cuando se requiere un mayor control del proceso de inyección de dependencia. Aplica para especificar argumentos de constructores individuales o parámetros de métodos, esta evita que se genere confusión cuando se crea más de un bean (componente software reutilizable) del mismo tipo y se desea conectar solo uno de ellos con una propiedad._
  * @Service: _Marca una clase (java) que se encarga de llevar a cabo algún servicio._  
  
  
_Después de configurar los beans con la clase GrammarChecker, este es el resultado inicial:_


![alt text](https://raw.githubusercontent.com/angiedanielar/LAB3_ARSW/master/img/1.png)
### Parte II
_Para lograr que el Bean 'GrammarChecker' ahora haga uso de la clase SpanishSpellChecker, simplemente hacemos lo realizado anteriormente pero con la clase de SpanishSpellChecker en lugar de la clase EnglishSpellChecker y este es el nuevo resultado:_


![alt text](https://raw.githubusercontent.com/angiedanielar/LAB3_ARSW/master/img/2.png)
### Pruebas Parte I y Parte II
_Pruebas del funcionamiento con la clase EnglishSpellChecker (Parte 1):_
![alt text](https://raw.githubusercontent.com/angiedanielar/LAB3_ARSW/master/img/3.png)


_Pruebas del funcionamiento con la clase SpanishSpellChecker (Parte 2):_
![alt text](https://raw.githubusercontent.com/angiedanielar/LAB3_ARSW/master/img/4.png)
## Cinema Book System 🎥
### Parte I - Pruebas 
![alt text](https://raw.githubusercontent.com/angiedanielar/LAB3_ARSW/master/img/5.png)


_Las pruebas de los filtros y la configuración de la inyección estan basadas sobre el filtrado por genero. Verificamos que al usar el filtrado de disponibilidad y las pruebas de dicho filtro todo sigue ejecutandose de manera correcta._


_**(A) Resultado filtro por género:**_


![alt text](https://raw.githubusercontent.com/angiedanielar/LAB3_ARSW/master/img/6.png)


_**(B) Resultado filtro disponibilidad:**_


![alt text](https://raw.githubusercontent.com/angiedanielar/LAB3_ARSW/master/img/7.png)
### 
## ¡¡¡Compile and run instructions!!! 🛠️
**_Para compilar:_**
_maven package_


**_Para ejecutar las pruebas:_**
_mvn test_


**_Para ejecutar las clases principales:_** 
 * _mvn exec:java -Dexec.mainClass="edu.eci.arsw.springdemo.ui.Main"_
 
 
 * _mvn exec:java -Dexec.mainClass="edu.eci.arsw.cinema.Main"_

 

