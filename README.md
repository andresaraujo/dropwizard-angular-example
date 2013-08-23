dropwizard-angular-example
==========================

Example of using AngularJS with Dropwizard


Requires:
npm (bower)
maven

Workflow:

Within src/main/app-client
1)run bower install to add web libraries under src/main/app-client/app/bower_components
2)run npm install to add node modules
3)run grunt to compile web files to the dist directory

To launch server (Within root directory)
1) run mvn compile exec:java
2) Open localhost:3000

To build self contained jar
1) run maven package
2) Go to target directory and run java -jar  dropwizard-angular-example-[version].jar server ../app.yml

