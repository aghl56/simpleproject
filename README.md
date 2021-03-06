# Технология разработки программного обеспечения
## Лабораторная работа №1: создание микросервиса на Spring Boot с базой данных
### Витушкина Анна Максимовна, группа 3МБД2001
Целью лабораторной работы является знакомство с проектированием многослойной архитектуры Web-API (веб-приложений, микро-сервисов).
## Инструкции по сборке и запуску приложения
### Клонирование репозитария
Чтобы склонировать репозитоий, необходимо выполнить команду `git clone https://github.com/aghl56/simpleproject.git`
### Сборка приложения в Maven
Чтобы осуществить сборку проекта, необходимо выполнить команду `mvn package -Dmaven.test.skip=true` (без тестирования), находясь в директории проекта. После выполнения команды в папке target должен появиться файл simpleproject-1.0.jar.
### Сборка Docker-образа
Для сборки Docker-образа нужно выполнить команду `docker build -t simpleproject:latest . ` находясь в директории проекта. 
### Запуск Docker-образа
Для запуска Docker-образа нужно выполнить команду `docker run -p 8080:8080 simpleproject:latest`
### Curl для обращения к ендпоинтам
- Для получения списка фильмов: `curl -X GET http://127.0.0.1:8080/api/v1/films`
- Для получения фильма по id: `curl -X GET http://127.0.0.1:8080/api/v1/films{id}`
- Для добавления фильма: `curl -X POST http://127.0.0.1:8080/api/v1/films -d ‘{"name": "Название фильма", "year": "Год выпуска", "genre": "Жанр"}’ -H «Content-Type:application/json»`
- Для возвращения имени компьютера: `curl -X GET http://127.0.0.1:8080/api/v1/status`
## Лабораторная работа №3: CI/CD и деплой приложения в Heroku
Целью лабораторной работы является знакомство с CI/CD и его реализацией на примере Travis CI и Heroku.

Ссылка на развернутое приложение: https://simpleproject-mt.herokuapp.com/api/v1/status
