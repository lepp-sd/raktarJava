A Projekt: Okos-Raktár Robotvezérlés

1\. A Szabályzat (Enum)

Készíts egy RobotTipus nevű enumot, ami a robotok munkakörét tárolja.

Lehetséges értékek: TAKARITO, PAKOLO, HEGESZTO.



2\. A Tervrajz (Robot.java)

Készítsd el a Robot osztályt az alábbi szigorú szabályok szerint:



Adatok: 3 privát változója legyen: egy azonosito (String, pl. "R2D2"), egy tipus (az enumod alapján) és egy akkuSzint (egész szám).



Építkezés: Írj egy konstruktort, ami mind a 3 adatot bekéri. Kötelező a this kulcsszót használnod benne (tehát a postás paraméterek nevei egyezzenek meg a privát változók neveivel)!



Lekérdezés: Minden adathoz legyen egy Getter.



Módosítás (A Csavar!): Írj egy Settert kizárólag az akkuSzint-hez. Ez a Setter tartalmazzon egy if-else logikát: csak akkor engedje felülírni a robot akkuszintjét, ha az új érték 0 és 100 között van! Ha ezen kívül esik (pl. 150), akkor ne írja át, hanem dobjon egy hibaüzenetet a konzolra!



A Mesélő (Override): Generálj egy toString() metódust, ami szépen összefűzi a robot adatait.



Az Ikrek Tesztje (Override): Generálj egy equals() (és hashCode()) metódust! Amikor a gép megkérdezi, hogy melyik adat alapján számítson két robot egyenlőnek, CSAK az azonosito-t pipáld be! (A logikánk szerint: ha két robotnak ugyanaz a neve, akkor az ugyanaz a gép, függetlenül attól, mennyi az akkuszintje).



3\. A Főprogram (Vizsga.java)

Ide jön a vezérlés, lépésről lépésre:



1\. Felvonás - Az Ikrek Tesztje: Hozz létre egyenként két külön Robot objektumot, de adj nekik hajszálpontosan ugyanazt az azonosítót (pl. "R2D2"), viszont adj nekik eltérő akkuszintet! Egy if-else blokkban használd az .equals() metódust! Ha egyenlőek, írd ki: "Azonosító egyezés! Ez a két gép ugyanaz.", különben írd ki: "Ezek különböző gépek."



2\. Felvonás - A Flotta: Hozz létre egy 3 férőhelyes tömböt, és pakolj bele 3 teljesen új, különböző robotot!



3\. Felvonás - A Műszak vége: Egy for ciklussal menj végig a flottán. Minden robotnál hívd meg az Akku Settert, és próbáld meg beállítani az akkuszintjüket 150-re! (Ha jól írtad meg a Settert az osztályban, itt 3 darab hibaüzenetet kell kapnod a konzolon).



4\. Felvonás - Az Eredmény: Egy újabb for ciklussal (vagy az előző végén) nyomtasd ki a robotokat.



5\. Felvonás - A Töltőállomás Radarképe:



Hozz létre egy 4x4-es, karaktereket tároló kétdimenziós tömböt!



Töltsd fel üres, '\_' (alsó vonal) karakterekkel!



Helyezd el a 3 robotod kezdőbetűjét (pl. 'R', 'W', 'C') a térkép 3 tetszőleges sarkába vagy pontjára (célozz meg konkrét \[sor]\[oszlop] indexeket)!



A dupla ciklussal nyomtasd ki a radarképet a képernyőre!

