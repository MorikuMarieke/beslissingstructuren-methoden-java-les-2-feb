## Inleiding
Welkom bij de eerste huiswerkopdracht die jullie gaan maken voor de Backend leerlijn. Je hebt als het goed is de eerste hoofdstukken gelezen en de eerste les van de cursus Java gevolgd. In deze opdracht ga je oefenen met wat je tot nu geleerd hebt over beslissingsstructuren en methodes.

## Opzetten van een nieuw Java project

1. Open IntelliJ op je computer.

2. Kies rechts bovenin voor _New project_.

3. Op het volgende scherm zie je linksboven dat _Java_ blauw geselecteerd is. Daar klik je op _Next_.

4. Op het volgende scherm hoeven we niks te selecteren en kunnen we gewoon op _Next_ klikken.

5. Op het volgende scherm kunnen we een naam meegeven aan het project. Kies altijd een beschrijvende naam die iets zegt over je project zodat je ook weet wat erin staat. Bijvoorbeeld "javaOpdracht1".

6. Klik daarna op 'Finish'. Gefeliciteerd! Je hebt zojuist je eerste project aangemaakt.

## Opdrachtbeschrijving

Maak in het nieuwe Java project dat je hebt gemaakt een main klasse en een `public static void` main methode. Maak daarnaast ook de volgende methodes:
- `hello()`
- `positiveOrNegative(int number)`
- `postiveOrZeroOrNegativ(int number)`
- `bartender(String name)`
- `sum(int input1, int input2)`

Maak de volgende variabelen aan in de main methode:
- `int number`
- `int input1`
- `int input2`
- `String name`

Het gedrag van de methoden is als volgt:
- De `hello`-methode print de regel "Hello, world!";
- De `positiveOrNegative`-methode print aan de hand van een _if else_ statement "This number is positive!" of "This number is negative!";
- De `positiveOrZeroOrNegative`-methode print aan de hand van een _if else if else_ statement "This number is positive!", "This number is zero!" of "This number is - negative!";
- De `bartender`-methode print aan de hand van een _switch_ statement, het drankje dat deze persoon graag drinkt;
- De `sum`-methode print de uitkomst van de twee nummers die bij elkaar zijn opgeteld.

De waarde van `number` is 6.
De waarde van `input1` is 4.
De waarde van `input2` is 20.
De waarde van `name` is Henk.

Roep alle methodes aan vanuit de main methode, verander de waardes en kijk wat eruit komt als je de waardes aanpast en opnieuw draait.

![Drinks](./assets/drankjes.jpg)


## Randvoorwaarden
De opdracht moet voldoen aan de volgende voorwaarden:

- minimaal 4 _variabelen_
- minimaal 5 _methodes_
- 1 _if/else_ statement
- 1 _if/else if/else_ statement
- 1 _switch_ statement


## Stappenplan
Let op: het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken.

1. Maak een nieuw project aan in IntelliJ.

2. Maak een nieuwe klasse aan genaamd  `Main`. Doe dit door met de rechter muisknop op de map `SRC` te klikken, vervolgens klik je op `New` en dan op `Java class`.

3. Maak een `public static void main` methode aan.

4. Maak in de `public static void main` methode de variabelen aan die hierboven genoemd zijn met de juiste waarden.

5. Maak na de `}` van de `public static void main` methode een nieuwe public static void methode met de naam `hello`. Laat deze methode een regel printen door `System.out.println` te gebruiken. Kijk hierboven voor de juiste tekst. Deze methode krijgt geen _variabelen_ mee gestuurd.

6. Roep de `hello` methode aan in de `public static void main` methode. Laat nu de applicatie draaien door op de play-knop in de goot van IntelliJ te drukken.

7. Maak een `public static void` mehode aan met de naam `positiveOrNegative` en geef deze de juiste _parameters_ mee. Zet in deze methode een _if else_ statement. De voorwaarde van de _if_ is `(number > 0)`. Bij de _if_ moet de methode de tekst: "This number is positive!" printen. Bij de _else_ mag de tekst: "This number is negative!".

8. Roep deze methode aan in de `public static void main` methode en geef het juiste _argument_ mee. Laat de applicatie weer draaien door op de play-knop te drukken.

9. Verander de waarde van `number` naar -6 en draai de applicatie opnieuw. Wat is er nu veranderd? En wat als `number` de waarde 0 heeft? Klopt dit?

10. Maak een nieuwe `public static void` methode aan genaamd `positiveOrZeroOrNegative` en geef deze de juiste _attributen_ mee. Plaats in deze methode een _if else if else_ statement. Deze lijkt veel op de _if else_ statement van de `positiveOrNegative` methode, echter staat er tussen de _if_ en de _else_ nog een _else if_ met de volgende voorwaarde: `(number == 0) {System.out.println("This number is zero!}`.

11. Roep ook deze methode aan vanuit de `public static void main` methode en geef ook hier de juiste _argument_ aan mee.

12. Maak een nieuwe `public static void` methode genaamd `bartender` en geef deze de juiste _parameter_ mee. Gebruik in deze methode de _switch_ statement om aan de hand van de `string name` het drankje van verschillende personen te printen. De uitkomst moet er uit zien als "Henk wants a Bacardi cola". Denk er ook over na wat er gebeurt als de parameter een naam ontvangt waar je geen switch case voor hebt geschreven.

13. Roep ook deze methode aan vanuit de `public static void main` methode en speel met verschillende namen die je in de _ switch_ cases hebt gezet.

14. Maak nog een `public static void` methode aan genaamd `sum` en geef deze de juiste _parameters_ mee. Laat deze methode de volgende tekst printen: "input1 summed by input2 = 24".

15. Roep deze methode ook aan in de `public static void main` methode en speel met verschillende waardes.

## Bonus

Is het je gelukt om deze opdracht te maken en wil je nog meer oefenen?
In de "Bonus" map op deze repository staan 2 sets met opdrachten, 1 met if/else/switch opdrachten en 1 met for/while opdrachten.
Deze opdrachten mag je proberen te maken ter oefening.
Je kunt zelf natuurlijk ook scenario's bedenken zoals in deze opdrachtjes staan beschreven en daar een oplossing voor proberen te programmeren.

Lukt het nog niet helemaal om deze bonusopdrachten te maken? Laat ze dan nog  even liggen en kom er later op terug.

# BONUS IF/ELSE: Maak de volgende opdrachten

Voor deze opdrachten zul je methodes met parameters moeten schrijven.
In elke methode kun je vervolgens met if-statements de opdracht uitvoeren.
Je mag de methodes in de _Ifelse_ klasse schrijven.

### Opdracht 1: Even/Odd Checker [done]

Schrijf een methode dat als input een getal van de gebruiker accepteert en controleert of het even of oneven is. Print "Het getal is even" of "Het getal is oneven".

### Opdracht 2: Grader [done]
Schrijf een methode dat een cijfer van een student accepteert (tussen 1 en 10) en op basis van dat cijfer een bijbehorende letterwaarde toekent (A, B, C, D, F). Je mag googlen naar het juiste cijferbereik voor elke letterwaarde, maar je mag het ook gokken.


### Opdracht 3: Grootste van Twee Getallen [done]
Schrijf een programma dat de grootste van twee ingevoerde getallen bepaalt.

### Opdracht 4: Positief/Negatief/Zero Checker [done]
Schrijf een methode dat een getal van de gebruiker accepteert en aangeeft of het positief, negatief of nul is.

### Opdracht 5: Leeftijdsclassificatie [done]
Schrijf een methode dat de leeftijd van een persoon accepteert en bepaalt of die persoon een kind, puber, volwassene of senior is.

### Opdracht 6: Tekstlengte Checker [done]
Schrijf een methode dat een tekst accepteert en controleert of de lengte van de tekst "kort" (korter dan 10 tekens), "middellang" (tussen 10 en 20 tekens) of "lang"(langer dan 20 tekens) is.

### Opdracht 7: Jaar Checker [done]
Schrijf een methode die controleert of een gegeven jaartal een schrikkeljaar is of niet.

(
Het is een schrikkeljaar wanneer deze deelbaar is door 4, maar een eeuwjaar (100 jaar) die deelbaar is door 4 weer niet, met uitzondering als deze wel deelbaar is door 400. bron: https://berekenenonline.nl/schrikkeljaar/
)

### Opdracht 8: Grootste van Drie Getallen [done]
Schrijf een programma dat de grootste van drie ingevoerde getallen bepaalt.

### Opdracht 9: Driehoekstype [done]
Schrijf een methode dat de lengtes van de zijden van een driehoek accepteert en bepaalt of de driehoek gelijkzijdig, gelijkbenig of ongelijkzijdig is.

### Opdracht 10: Calculator [done]
Schrijf een eenvoudige rekenmachine-methode die als parameters twee getallen en een operator (+, -, *, /) accepteert en vervolgens het resultaat van de berekening weergeeft.


# BONUS LOOPS: Kies: while-loop of for-loop?

Voor deze opdracht moet je kiezen of je een for-loop of een while-loop gebruikt.
In de meeste gevallen is er geen fout antwoord, maar wel is er vaak een goede reden om de een over de ander te kiezen.

1. Je moet de som van alle even getallen berekenen van 1 tot 100.
2. Je wilt een reeks van getallen afdrukken, beginnend bij 1 en elke keer vermenigvuldigd met 2, totdat het resultaat groter is dan 1000.
3. Je moet een lijst van getallen doorlopen en controleren of het getal 45 aanwezig is.
```
De lijst met getallen: {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51}
```

4. Je wilt een array van integers doorlopen en de som van de elementen berekenen.
```
De array van integers: {12, 5, 7, 2, 18, 3, 9, 12}
```
5. Je hebt een lijst van strings en je wilt elk element afdrukken totdat je een lege string tegenkomt.
```
De lijst met Strings: {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"}
```
6. Je wilt alle priemgetallen afdrukken tussen 1 en 100.

7. Je hebt een lijst van integers en je wilt elk element afdrukken dat groter is dan 45.
```
De lijst van integers: {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51}
```
8. Je wilt een teller implementeren die begint bij 10 en wordt verminderd met 1 totdat het gelijk is aan 0.
9. Je moet de eerste 10 Fibonacci-getallen genereren. (tip: google is je vriend)
10. Je wilt een driehoek afdrukken met behulp van sterretjes, waarbij het aantal sterretjes in elke rij toeneemt. (tip: google is je vriend)
```
          *
         ***
        *****
       *******
 etc.. 
 etc..
```

Maak jou uitwerkingen in de _"Loops"_ klasse.#   b e s l i s s i n g s t r u c t u r e n - m e t h o d e n - j a v a - l e s - 2 - f e b  
 