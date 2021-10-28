# String API
API umozliwiające uzysaknie indormacji o Stringu przekazanym
w parametrze zapytania GET. W odpowiedzi dostajemy informacje o ilości
wielkich i małych liter, ilości liczb itp.

## Składnia
```
api_path/{parameter_text} 
```
## Przykład
```
http://localhost:8080/api/v1/ABCDefgh1234!@#$
```
## Wynik
Odpwiedź w formacie JSON:
```json
{
  "parameter": "hElLo WoRlD1337 aaa!!!",
  "length" : 22, 
  "digits": 4,
  "upperCase": 5,
  "lowerCase": 8,
  "whitespace": 2,
  "specialCharacters": 3
}
```