# Dokumentacija
|                              |                                                     |
|:-----------------------------|:----------------------------------------------------|
|**Naziv projekta**            |Quick Wheels                                         |
|**Člani skupine**             |Nikolay Vasilev                                      |
|**Naziv projekta**            |Ljubljana, 14. 11. 2022                              |


## 1. Opis projekta
### 1.1. Povzetek
**Aplikacija Quick Wheels** omogoča skrbnikom vseh vrst dostavnih podjetij izračunati optimalno dostavno pot za nabor naročil v določenem času na podlagi različnih kriterijev - vrste naročila, prometa, lokacije naročnika, lokacije ponudnika ter prevoznega sredstva dostavljavca. Da bi lahko vse to omogočala, aplikacija uporablja dve razvite mikrostoritvi - **mikrostoritev za naročila** in **mikrostoritev za dostavo**, od katerih ima vsaka svoj API in podatkovno bazo. Ti dve mikrostiritvi sodelujeta med seboj ter s zunanjo mikrostoritev za zemljevide **Google Maps**, da bi lahko uporabniki izkoristili glavne primere uporabe aplikacije.

### 1.2. Osnovni primeri uporabe aplikacije
Primeri uporabe aplikacije lahko v grobem razdelimo na funkcionalnosti o:
+ statusih naročil - ustvarjanje novega statusa naročila, prikaz seznam statusov naročil, posodabljanje obstoječega statusa naročila;
+ izdelkov - ustvarjanje novega izdelka, prikaz seznam izdelkov, posodabljanje obstoječega izdelka;
+ naročil - ustvarjanje novega naročila, prikaz seznam naročil, posodobitev obstoječega naročila;
+ naročnikih - ustvarjanje novega naročnika, prikaz seznam vseh naročnikov, posodabljanje obstoječega naročnika;
+ dostavnih prevozov - ustvarjanje novega dostavnega prevoza, prikaz seznam vseh dostavnih prevozov, posodabljanje obsteječega dostavnega prevoza;
+ vrst dostave - ustvarjanje nove vrste dostave, prikaz seznam vseh vrst dostave, posodabljanje obstoječo vrsto dostave;
+ dostave - ustvarjanje novo dostavo, prikaz seznam vseh dostav, posodabljanje obstoječo dostavo;
+ kompleksnih zahtev - prikaz optimalne poti za izbrano dostavo, prikaz več kot ene možne poti dostave, prikaz prometa na izračunani poti dostave, posodabljanje izračunane poti dostave, prikaz možnih počivališč na dostavni poti, prikaz možnih bencinskih črpalk na dostavni poti, uporaba trenutne naprave kot lokacije ponudnika (funkcionalnost GPS)

### 1.3. Uporabljena tehnologija
+ Ogrodje in razvojno okolje, ki ju nameravate uporabljati pri razvoju vaše rešitve
Aplikacijo in mikrostoritve smo razvili v ratvojnem okolju IntelliJ IDEA. Za razvoj aplikacije smo uporabili Java Swing - komplet orodij za grafični uporabniški vmesnik (GUI), ki ponuja bogat nabor pripomočkov in paketov za izdelavo kompleksnih komponent vmesnika za Java aplikacije. Za razvoj obeh mikrostoritev pa smo uporabili mikrostoritveno ogrodje KumuluzEE v Javi, za katerega smo potrebovali tudi Apache Maven za izdelavo našega projekta. Vsaka mikrostoritev ima svoj REST API in uporablja lastno bazo podatkov SQL. Prav tako smo vzpostavili cikel zvezne integracije CI/CD z uporabo Github Actions za ustvarjanje novo Docker sliko vsake mikrostoritve in objavo na portalu Docker Hub (v oblaku). V razvojnem procesu smo uporabljali Postman, da smo zagotovili, da zahteve in odgovori mikrostoritev delujejo tako, kot bi morali.

## 2. Uporabljene mikrostoritve
### 2.1. Opis mikrostoritve za naročila ([povezava](https://github.com/rso-2022-2023/RSO_S47_Order))
#### Povzetek
#### Osnovni funkcionalnosti
### 2.2. Opis mikrostoritve za dostavo ([povezava](https://github.com/rso-2022-2023/RSO_S47_Delivery))
#### Povzetek
#### Osnovni funkcionalnosti
### 2.3. Opis zunanje mikrostorive za zemljevide ([povezava](https://developers.google.com/maps/documentation))
#### Povzetek
#### Osnovni funkcionalnosti

## 3. Načrt arhitekture
### 3.1. Shema arhitekture
### 3.2. Shema interakcij med miktrostoritvami
+ Komunikacijske protokole
+ Kompleksnejši zahtevek, pri obdelavi katerega bodo sodelovale vsaj tri mikrostoritve.
### 3.3. Osnutki zaslonskih mask aplikacije
### 3.4. Primeri podatkovnih objektov aplikacije
