# inlamning1computer
1. Det finns ett antal klasser och gränssnitt i programkoden ovan och det behövs ytterligare några för att kunna implementera programmet. Vilka klasser saknas och vilka är gränssnitt respektive klasser?

Saknas: 
  - 
 

2. Klassen Program har till synes metoden add för att lägga till en instruktion till programmet. Vilken standardklass skulle man kunna utvidga för att slippa implementera metoden själv? Är det lämpligt att göra så?

Man skulle kunna använda en lista med ProgCommands som sedan körs. Detta istället för att ha en ProgMacro-klass som ger oss add-funktionen.

3. Klasserna skall fördelas på minst två paket. Vilka paket bör finnas och hur fördelas klasserna? (Under föreläsning 6 kommer vi att prata mer om paketindelning, men fundera gärna redan nu igenom vilka klasser som 'hör ihop' i detta projekt).

Computer package: 

 - 
 
Program package:
 
  - 

4. Studera designmönstret Command. Var och hur bör det användas i uppgiften.

Används när vi ska bygga upp Program, skapas i interfacet ProgCommand. Laddar flera program samtidigt i en stack och kör sedan detta.

5. Studera designmönstret Template method. Mönstret skall användas för att undvika duplicerad kod i likartade klasser. Var kan detta bli aktuellt?

WordFactory, BinOp, JumpOp. 

6. Studera designmönstret Strategy och exemplen från föreläsningarna. Hur använder man mönstret för att hantera olika sorters operander på ett enhetligt sätt?

Delar inte upp i olika typer av klasser, utan har en med olika operandattribut. Det behövs fortfarande ett interface för operandtypen. 
Om man vill kunna ändra en operand efter objektet har deklarerats är det viktigt att implementera Strategy. 

7. När man exekverar Add-instruktionen skall man utföra en addition av två tal. I vilken klass skall additionen utföras?

Kommer utföras i klassen Add, om vi inte använder strategy - då körs det i program. 
Alla program behöver dock inte Add, så därför är en klass Add det bästa alternativet. 

8. Rita ett sekvensdiagram på papper som visar alla inblandade objekt när Add-kommandot i Factorial exekveras.


9. Vad bör hända om någon gör anropet (observera att vi använder olika slags factories när vi skapar programmet och när vi skapar minnet):

Programmet kraschar och skrivet ut en 0:a, då vi måste ha samma typ av WordFactory i minnet som i programmet. 
