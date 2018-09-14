# inlamning1computer
1. Det finns ett antal klasser och gränssnitt i programkoden ovan och det behövs ytterligare några för att kunna implementera programmet. Vilka klasser saknas och vilka är gränssnitt respektive klasser?


2. Klassen Program har till synes metoden add för att lägga till en instruktion till programmet. Vilken standardklass skulle man kunna utvidga för att slippa implementera metoden själv? Är det lämpligt att göra så?

Man skulle kunna använda en lista. Det kanske är olämpligt att kunna ändra i mitten. Man skulle kunna använda en stack. Historik.

3. Klasserna skall fördelas på minst två paket. Vilka paket bör finnas och hur fördelas klasserna? (Under föreläsning 6 kommer vi att prata mer om paketindelning, men fundera gärna redan nu igenom vilka klasser som 'hör ihop' i detta projekt).

Ett computerpaket med Memory och Program.

4. Studera designmönstret Command. Var och hur bör det användas i uppgiften.

Computer. Ladda flera program samtidigt i en stack och sen köra.

5. Studera designmönstret Template method. Mönstret skall användas för att undvika duplicerad kod i likartade klasser. Var kan detta bli aktuellt?

Wordfactory & Program.

6. Studera designmönstret Strategy och exemplen från föreläsningarna. Hur använder man mönstret för att hantera olika sorters operander på ett enhetligt sätt?

Alla har egna operander. Metoder ligger inte i själva objektet, utan i interfacet.

7. När man exekverar Add-instruktionen skall man utföra en addition av två tal. I vilken klass skall additionen utföras?

Kommer utföras i klassen Add, om vi inte använder strategy - då körs det i program. 
Alla program behöver dock inte Add, så därför är en klass Add det bästa alternativet. 

8. Rita ett sekvensdiagram på papper som visar alla inblandade objekt när Add-kommandot i Factorial exekveras.


9. Vad bör hända om någon gör anropet (observera att vi använder olika slags factories när vi skapar programmet och när vi skapar minnet):
