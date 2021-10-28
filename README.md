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
http://localhost:8080/api/v1/ABCabc123@!@
```
## Wynik
Odpwiedź w formacie JSON:
```json
{
  "parameter": "ABCabc123@!@",
  "length" : 12, 
  "digits": 3,
  "upperCase": 3,
  "lowerCase": 3,
  "whitespace": 0,
  "specialCharacters": 3
}
```