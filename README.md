# SpreadMaster_MS
The **Edgar Lee Masters Anthology** is to me, one of the most important book of the last century, a proof of this is that it has been quoted and analyzed many many times spanning from songwriters to philosophers.

After reading this book i felt the need to leave my contribution in order to keep the importance and the majestic of this book up and to spread and to further increase the popularity which this text deserves.

This is the second part of the project, you can find the first one at: https://github.com/casinesque/SpreadMasters_TextProcessing

While the first one clean data and prepare the database, this publicly expose an API for interrogate the application.

Basically this webApp on the ``` \get``` path returns a random poetry from the book, which may be useful for schools and related.

Simply connect to https://spread-masters.herokuapp.com/get where currently the backend of the app is deployed to get your poetry.

### IMPLEMENTATION:
This is a pretty simle SpringBoot App Microservice, with its proper persistence layer (Postgres) and JPA as persistence APIs.
Is currently deployed on the Heroku free tier which looks pretty good to me.

### TO DO:
* Implementing a frontend and deploying on Heroku as well
* Implement the english version (Royalty free PDF versions are welcome)  
