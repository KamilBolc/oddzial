Meta:

Narrative:
Jako uprawniony uzytkownik
Chcialbym miec mozliwosc wejscia do modulu OddzialPlus

Scenario: Czy jestem wstanie wejsc do modulu OddzialPlus
Given Otwarta przegladarka Frirefox
When Loguj sie jako "m.zalewski"
And Klikam przycisk OddzialPlus
Then Uzytkownik znajduje sie w module OddzialPlus