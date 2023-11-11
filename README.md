# App-WhatsDAM.-Sprint-3

## 1.Estructura de paquets

Creems els differents paquets com segueix:

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-3/assets/145864071/289a7376-6735-426a-a9f1-22fe22ceeec7)


## 2.Creacio capa model

Arrossegem els dataclass i llista i refactoritzem:

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-3/assets/145864071/e9f012df-ed1e-4a53-b384-259f2483e0cb)

## 3.Creacio repository

El repository es una classe auxiliar necessaria per al nou model:

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-3/assets/145864071/22c89edb-5c51-4bda-8bb1-6e7aea4b754b)

Implementem la classe seguint el patró singleton:

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-3/assets/145864071/e0cb9c72-5b26-4a87-8978-2eb2c226fa61)

## 4.Modificació de l'adaptador

Reogranitzem les classes que queden i creen la MissatgesViewModel: 

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-3/assets/145864071/f316fca3-c135-49c4-a4d4-3bfeb795f6a4)

Implementem el ViewModel seguint el patró definit i definint LiveData amb dos propietats, una privada i altra pública per seguretat i confinament de codi. També preparem l’adaptador. I finalment, implementem el métode add per a afegir nous missatges. El métode es prepara per a ser observat

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-3/assets/145864071/118dba6b-b3f3-45dd-a96e-879878d843ef)

## 5. Modificacions vista

Primer afegim la instància del ViewModel:

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-3/assets/145864071/6bb908a2-5053-4ff7-a40f-e488995c24c3)

Afegim el ViewModel:

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-3/assets/145864071/5e4fa2bd-322b-4fa0-b504-b9e9ad783f2a)


Afegim el observador i el métode add

![imagen](https://github.com/alejandrorubio29/App-WhatsDAM.-Sprint-3/assets/145864071/64894f99-b24e-4dd8-8c97-9e65186c6216)




