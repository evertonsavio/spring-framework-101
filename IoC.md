### Inversion of Control IoC  
  
* Sua aplicacao vai terceirizar a construção e gerenciamento de objetos.  
  
* Formas de configurar um Container Spring. XML COnfiguration"Legacy", Java Annotations (Modern), Java Source Code (Modern)  
--------------------------
* Primeiro Passo: Configurar Spring beans com XML =(    
* Segundo passo: Criar um Container SPring -> applicationContext.xml  
* Recuperar os Beans do container 
> When Java objects are created by the Spring Container, then Spring refers to them as "Spring Beans".
--------------------------  
* applicationContext.xml  
```  
<bean id="Treinador"
 class="dev.evertonsavio.springdemo.RastrearTreinador">	 		
 </bean>
``` 

