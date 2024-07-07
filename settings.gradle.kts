pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/BackPackerDz/MavenTestingAndroidLib")
            credentials {
                username = System.getenv("GITHUB_USER") ?: "your_github_username"
                password = System.getenv("GITHUB_TOKEN") ?: "your_github_pat"
            }
        }
        google()
        mavenCentral()
    }
}

rootProject.name = "TestCAndroid"
include(":app")
include(":mylibrary")
