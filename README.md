# PMDM_Junio_Android

App Android en Kotlin (mayo de 2023, ciclo de DAM, módulo de programación multimedia y dispositivos móviles). El nombre de la aplicación es "Ordinaria 2023" y trata de un catálogo de películas.

## Qué hay

- Tres pantallas con Navigation Component: bienvenida, listado de seis películas con `RecyclerView` y detalle (título, año, director, género y reparto).
- Datos de las películas escritos en `Datasource.kt`, con sus carteles en `res/drawable`.
- `MyViewModel` con un contador `LiveData`, y data binding en los fragmentos.
- Textos en inglés y en español.
- Código de Room y Retrofit para consultar libros por ISBN, pero está todo comentado: no se usa.
- Limitaciones: la pantalla de detalle siempre enseña la primera película, porque el listado no le pasa cuál se ha pulsado. Los nombres de paquete son `es.davidcorcuera.ordinaria2023` (carpetas, `applicationId`) y `...ordinaria20231` (declaraciones `package` y manifiesto); no los he tocado.

No lo he compilado ni ejecutado desde aquí (no tengo Android SDK). Se abre con Android Studio.

## Licencia

MIT para el código, ver [LICENSE](LICENSE). Los carteles de las películas no son míos y quedan fuera de la licencia.

---

# PMDM_Junio_Android (English)

An Android app in Kotlin (May 2023, DAM vocational course, mobile development module). The app is named "Ordinaria 2023" and is a movie catalogue.

## What's inside

- Three screens with the Navigation Component: welcome, a list of six movies with `RecyclerView`, and a detail screen (title, year, director, genre and cast).
- Movie data written in `Datasource.kt`, with their posters in `res/drawable`.
- `MyViewModel` with a `LiveData` counter, and data binding in the fragments.
- Texts in English and Spanish.
- Room and Retrofit code to look up books by ISBN, but it is all commented out and unused.
- Limitations: the detail screen always shows the first movie, because the list does not pass it which one was tapped. The package names are `es.davidcorcuera.ordinaria2023` (folders, `applicationId`) and `...ordinaria20231` (`package` declarations and manifest); I have not changed them.

I have not compiled or run it from here (no Android SDK). Open it with Android Studio.

## License

MIT for the code, see [LICENSE](LICENSE). The movie posters are not mine and are outside the license.
