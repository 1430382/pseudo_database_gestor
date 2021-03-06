# Pseudo Database Gestor custom implementation in Java 
_This project use Java and its a custom implementation of MYSQL queries_
#
### Pre-requirements 📋
_Libs for test_

```
hamcrest-core-1.3.jar
junit-4.13-beta-3.jar
```
#
_It can perform queries like selects, with where or without where, update, delete, and select with alias and a simple insert:_

```
It accepts > , != , < , =
Some examples
Note: you can specify the PATH but this project was build in intellij IDEA, so the txts are in the same path as the project

```
* select * from pruebas ; - where pruebas is the name of the .txt and its not necessary the ; in the query
* Select Nombre from pruebas where Nombre!=Rebeca
* update pruebas set Matricula=1 where Nombre=Rebeca
* delete from pruebas where Matricula<1730042
* delete from pruebas where Matricula>1730042
* select pruebas.Nombre as pruebas, pruebas1.Matricula as pruebas1 from pruebas,pruebas1 where pruebas.Matricula=pruebas1.Matricula 
* insert into pruebas (Nombre,Matricula) values("Test",100)
#

```
It read a txt with information with "," as a data separator and ";" as a separator for the label in the first line

example_0: John,Doe ---  example_1: Name Lastname;

```
#

