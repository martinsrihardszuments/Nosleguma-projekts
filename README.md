# Nosleguma-projekts

## Projekta uzdevums

Projekta uzdevums ir izmantojot pandas biblotēku nolasīt .xlsx failu, filtrēt datus, pamatojoties uz lietotāja ievadītajiem datiem pēc kuriem
filtrē datus un saglabā šos filtrētos datus jaunā filtered_data.xlsx failā.

## Izmantotās bibliotēkas

Projektā tika izmantota viena bibliotēka "Pandas" kas ir python bibliotēka, kas piedāvā datu struktūru un datu analīzes rīkus, kas palīdzēja šajā projektā.
Bibliotēka arī piedāvā DataFrame ojektus, kas palīdz manipulēt datus excel failos.

### Piemēri

1. Datu nolasīšana: fails = pandas.read_excel("data.xlsx", sheet_name="Sheet1") - pandas.read_excel, kas nolasa excel failu un pārveido datus DataFrame formātā, lai ar tiem būtu vieglāk strādāt.
2. Datu filtrēšana un analīze = filtered_df = pandas.DataFrame(filtered_data, columns=fails.columns) - ļauj veikt filtrēšanu.
3. Datu saglabāšana = filtered_df.to_excel("filtered_data.xlsx", index=False) - Palīdz saglabāt filtrētos datus datus jaunā excel failā.

Izmantojot "pandas" jūs varat izveidot efektīvu un lasāmu kodu datu apstrādei un analīzei. Tas ir īpaši noderīgi, ja jūs strādājat ar lielām datu kopām.

## Izmantošanas metodes

1. Instalēt python
2. Instalēt "pandas" bibliotēku ar "pip install pandas"
3. Lejuplādējiet doto python skriptu un .xlsx failu, vai arī izveidojiet codespace githuba
4. Palaižiet kodu ar comandu run python in terminal
5. Ievadiet savus vēlamos kritērijus un specīali, kā ir uzdot jautājumā -
6. Female or Male or All - Female
France, Great Britain, United States or All - France
Age greater than 21-58 - 25
7. Apskatiet rezultātus jaunajā filtered_data.xlsx failā, kurā būs pieejami tikai filtrētie dati.
