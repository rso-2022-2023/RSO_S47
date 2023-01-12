# Dokumentacija
|                              |                                                     |
|:-----------------------------|:----------------------------------------------------|
|**Naziv projekta**            |Quick Wheels                                         |
|**Člani skupine**             |Nikolay Vasilev                                      |
|**Kraj in datum**             |Ljubljana, 12. 01. 2023                              |


## 1. Opis projekta
### 1.1. Povzetek
**Aplikacija Quick Wheels** omogoča skrbnikom vseh vrst dostavnih podjetij izračunati optimalno dostavno pot za nabor naročil v določenem času na podlagi različnih kriterijev - vrste naročila, prometa, lokacije naročnika, lokacije ponudnika ter prevoznega sredstva dostavljavca. Da bi lahko vse to omogočala, aplikacija uporablja dve razvite mikrostoritvi - **mikrostoritev za naročila** in **mikrostoritev za dostavo**, od katerih ima vsaka svoj API in podatkovno bazo. Ti dve mikrostiritvi sodelujeta med seboj ter s zunanjo mikrostoritev za zemljevide **Amazon Location Service**, da bi lahko uporabniki izkoristili glavne primere uporabe aplikacije.

### 1.2. Osnovni primeri uporabe aplikacije
V aplikaciji imamo le eno vlogo - administrator, ki upravlja z naročili in njihovo dostavo. Primeri uporabe aplikacije lahko v grobem razdelimo na funkcionalnosti o:
+	Izdelava novega naročila, ki vsebuje določeno količino izbranega izdelka iz baze.
+	Ogled seznama obstoječih naročil in podrobnosti o njih.
+	Urejanje obstoječih naročil.
+	Kreiranje nove dostave za eno ali več naročil za določeno stranko iz baze.
+	Ogled seznama obstoječih dostav in podrobnosti o njih.
+	Urejanje obstoječih dostav.
+	Prikaz zemljevida.
+	Prikaz poti od prodajalca do kupca na zemljevidu.
+	Izračunan čas dostave glede na vrste prevoza in dostave.


### 1.3. Uporabljena tehnologija
+ Ogrodje in razvojno okolje, ki ju nameravate uporabljati pri razvoju vaše rešitve
Aplikacijo in mikrostoritve smo razvili v ratvojnem okolju IntelliJ IDEA. Za razvoj aplikacije smo uporabili Java Swing - komplet orodij za grafični uporabniški vmesnik (GUI), ki ponuja bogat nabor pripomočkov in paketov za izdelavo kompleksnih komponent vmesnika za Java aplikacije. Za razvoj obeh mikrostoritev pa smo uporabili mikrostoritveno ogrodje KumuluzEE v Javi, za katerega smo potrebovali tudi Apache Maven za izdelavo našega projekta. Vsaka mikrostoritev ima svoj REST API in uporablja lastno bazo podatkov SQL. Prav tako smo vzpostavili cikel zvezne integracije CI/CD z uporabo Github Actions za ustvarjanje novo Docker sliko vsake mikrostoritve in objavo na portalu Docker Hub (v oblaku). V razvojnem procesu smo uporabljali Postman, da smo zagotovili, da zahteve in odgovori mikrostoritev delujejo tako, kot bi morali.

## 2. Uporabljene mikrostoritve
### 2.1. Opis mikrostoritve za naročila ([povezava](https://github.com/rso-2022-2023/RSO_S47_Order))
#### Povzetek
Mikrostoritev za naročila se uporablja za interakcijo z entitetami, kot so naročila in izdelki. Uporablja REST API in operacije CRUD in se lahko kombinira s katero koli dostavno mikrostoritvijo.
#### Osnovni funkcionalnosti
+	statusih naročil - ustvarjanje novega statusa naročila, prikaz seznam statusov naročil, posodabljanje obstoječega statusa naročila;
+	izdelkov - ustvarjanje novega izdelka, prikaz seznam izdelkov, posodabljanje obstoječega izdelka;
+	naročil - ustvarjanje novega naročila, prikaz seznam naročil, posodobitev obstoječega naročila;
### 2.2. Opis mikrostoritve za dostavo ([povezava](https://github.com/rso-2022-2023/RSO_S47_Delivery))
#### Povzetek
Mikrostoritev za dostave se uporablja za interakcijo z entitetami, kot so dostave in stranke. Uporablja REST API in operacije CRUD in se lahko kombinira s katero koli mikrostoritvijo naročila. Implementira tudi Amazon Location Service, kar omogoča dodatne funkcionalnosti.
#### Osnovni funkcionalnosti
+	naročnikih - ustvarjanje novega naročnika, prikaz seznam vseh naročnikov, posodabljanje obstoječega naročnika;
+	dostave - ustvarjanje novo dostavo, prikaz seznam vseh dostav, posodabljanje obstoječo dostavo;
+	naslov - ustvarjanje novega naslova, prikaz seznam vseh naslovov, posodabljanje obstoječega naslov;
+	vrst dostave - ustvarjanje nove vrste dostave, prikaz seznam vseh vrst dostave, posodabljanje obstoječo vrsto dostave;
+	statusih dostave - ustvarjanje novega statusa dostave, prikaz seznam statusov dostave, posodabljanje obstoječega statusa dostave;
+	dostavnih prevozov - ustvarjanje novega dostavnega prevoza, prikaz seznam vseh dostavnih prevozov, posodabljanje obsteječega dostavnega prevoza;

### 2.3. Opis zunanje mikrostoritve za zemljevide ([povezava](https://developers.google.com/maps/documentation))
#### Povzetek
Amazon Location Service se uporablja za interakcijo z zemljevidom, izračun poti glede na zemljepisno širino in dolžino ter druge uporabne funkcionalnosti. Mikrostoritev je implementirane v mikrostoritev za dostavo ter jo lahko dostopamo preko njegovih končnih točk (REST API).
#### Osnovni funkcionalnosti


## 3. Načrt arhitekture
### 3.1. Shema arhitekture

### 3.2. Shema interakcij med miktrostoritvami
