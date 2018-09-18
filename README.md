# inlamning1computer
1. Det finns ett antal klasser och gränssnitt i programkoden ovan och det behövs ytterligare några för att kunna implementera programmet. Vilka klasser saknas och vilka är gränssnitt respektive klasser?

 Klasser som ska läggas till 
 - Word : Interface
 - ByteWord : Klass
 - LongWord : Klass
 - Instructions : Interface
 - AdressOp : Abstrakt Klass
 - IndexOp : Abstrakt Klass
 - ProgramCounter : Klass

2. Klassen Program har till synes metoden add för att lägga till en instruktion till programmet. Vilken standardklass skulle man kunna utvidga för att slippa implementera metoden själv? Är det lämpligt att göra så?

Man skulle kunna använda listans egna add, vi tycker det är lämpligt att göra så då det är ett lätt sätt att hålla reda på index och att hoppa till bestämda index. 

3. Klasserna skall fördelas på minst två paket. Vilka paket bör finnas och hur fördelas klasserna? (Under föreläsning 6 kommer vi att prata mer om paketindelning, men fundera gärna redan nu igenom vilka klasser som 'hör ihop' i detta projekt).

Computer package: 

 - Computer
 - Memory
 - Address
 - WordFactory
 - ByteWordFactory
 - LongWordFactory
 - WordType
 - ByteWord
 - LongWord
 
Program package:
 
  - Program
  - ProgramCounter
  - Instructions
  - AddressOp
  - Add
  - Mul
  - Copy
  - IndexOp
  - Jump
  - JumpEq
  - Halt

4. Studera designmönstret Command. Var och hur bör det användas i uppgiften.

Det kan användas när vi bygger upp program för att skapa en execute som används när computer kör run(); på det laddade programet. Det har ej implementerats i vårt program
då vi kör en execute den abstracta klassen program direkt pga att vi använder lista och inte skapar en macroklass för att göra en metodstack.


5. Studera designmönstret Template method. Mönstret skall användas för att undvika duplicerad kod i likartade klasser. Var kan detta bli aktuellt?

WordFactory, WordType, AddressOp, IndexOp.

6. Studera designmönstret Strategy och exemplen från föreläsningarna. Hur använder man mönstret för att hantera olika sorters operander på ett enhetligt sätt?

Man inte upp i olika typer av klasser, utan har en klass med olika operandattribut. Det behövs fortfarande ett interface för operandtypen. 
Om man vill kunna ändra en operand efter objektet har deklarerats är det viktigt att implementera Strategy. 

7. När man exekverar Add-instruktionen skall man utföra en addition av två tal. I vilken klass skall additionen utföras?

Kommer utföras i klassen Add, om vi inte använder strategy. Vilket vi ej gör. Vi använder Template method vilket gör att instrutionen utförs i .this

8. Rita ett sekvensdiagram på papper som visar alla inblandade objekt när Add-kommandot i Factorial exekveras.

Se [`Sekvensdiagram.jpg`](Sekvensdiagram.jpg):


9. Vad bör hända om någon gör anropet (observera att vi använder olika slags factories när vi skapar programmet och när vi skapar minnet):

Programmet kraschar och skrivet ut en 0:a, då vi måste ha samma typ av WordFactory i minnet som i programmet. 
