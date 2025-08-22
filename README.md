# Web Services - Lektion 3: Spring & RESTful

## REST
- **Tillvägagångssätt:** Standard för att bygga webbtjänster.  
- **Begränsningar:** Regler för API-arkitektur.  
- **CRUD:** Create, Read, Update, Delete – grundoperationer.  
- **Caching:** Förbättrar prestanda genom lagring av svar.  
- **Omdirigering & vidarebefordran:** Hantering av olika förfrågningar och svar.  
- **Säkerhet:** Kryptering (HTTPS) och autentisering (t.ex. tokens).

---

## Viktiga Annotationer
- `@SpringBootApplication`  
  Startpunkt för applikationen, inkluderar flera underliggande annotationer.

- `@RestController`  
  Definierar en web service-controller i en **MVC-struktur**.

- `@GetMapping()`  
  Definierar en endpoint där logik exekveras.

- `@RequestParam()`  
  Gör det möjligt att ta emot **parametrar** i en endpoint för dynamiska värden.

---

## WebFlux
- **Reactive web:** Stöd för asynkrona och reaktiva operationer.  
- **Mono:** Hantering av **enstaka dataobjekt**.  
- **Flux:** Hantering av **dataströmmar**.

---

## Nyckelord
REST · CRUD · Caching · Säkerhet · Spring Boot · WebFlux · Mono · Flux
