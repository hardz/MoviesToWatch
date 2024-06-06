# MoviesToWatch

Welcome to the MoviesToWatch Android Application! This project demonstrates the use of modularization in Android development and leverages the latest tech stack, including Kotlin and Coroutines. It fetches data from The Movie Database (TMDb) to provide a rich, interactive user experience.

## Table of Contents

- [About The Project](#about-the-project)
- [Architecture](#architecture)
- [Tech Stack](#tech-stack)
- [Modules](#modules)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

### About The Project

**Modular Architecture**: The application is split into different modules for better scalability and maintainability.
**Kotlin**: Entirely written in Kotlin for modern, concise, and safe code.
**Coroutines**: Efficient asynchronous programming using Kotlin Coroutines.
**The Movie Database (TMDb) Integration**: Fetches movie data from TMDb API.
**MVVM Architecture**: Clean separation of concerns using the Model-View-ViewModel pattern.
**LiveData**: Observes data changes and updates the UI accordingly.


### Architecture

The project follows the MVVM (Model-View-ViewModel) architectural pattern. It is divided into multiple modules to improve modularity and manage dependencies effectively. The layers are:

UI Module: Contains Activities and Fragments for the user interface.
Domain Module: Includes use cases and business logic.
Data Module: Responsible for data retrieval and storage, including TMDb API integration.


### Tech Stack

 - **Programming Language**: Kotlin
 - **Asynchronous Programming** : Kotlin Coroutines
- **Dependency Injection**: Dagger/Hilt
- **Networking**: Retrofit
- **Image Loading**: Glide/Picasso
- **Database**: Room
- **Architecture Components**: LiveData, ViewModel

### Modules

The project is divided into the following modules:

- **core-data**: Manages data retrieval from the TMDb API and local database.
- **core-model**: Contains the data models used across the application.
- **core-network**: Manages network operations and API calls.
- **feature-bookmark**: Handles the bookmarking functionality.
- **feature-favourite**: Manages the favorite movies functionality.
- **feature-home**: Displays the home screen with a list of popular movies.
- **feature-profile**: Manages user profiles and related features.

## Usage
- **Browse Movies**: View a list of popular movies fetched from TMDb.
- **Movie Details**: Tap on a movie to see detailed information.
- **Search Movies**: Use the search functionality to find specific movies.
- **Bookmark Movies**: Save movies to your bookmarks for later viewing.
- **Favorite Movies**: Mark movies as favorites and access them easily.
- **User Profile**: Manage your user profile and preferences.


## Contributing

Contributions are welcome! To contribute:

Fork the repository.
Create a new branch for your feature or bugfix.
Make your changes.
Commit your changes with clear commit messages.
Push your branch to your forked repository.
Create a pull request with a description of your changes.

