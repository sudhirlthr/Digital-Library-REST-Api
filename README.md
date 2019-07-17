# Digital-Library-REST-Api

To run jar and browse Books by title =>
	1. Download jar from https://github.com/sudhirlthr/Digital-Library-REST-Api/blob/master/Digital-Library/target/Digital-Library-1.0.0.jar
	2. Open terminal/CMD, change directory to downloaded folder.
	3. To run the jar type java -jar Digital-Library-1.0.0.jar (If its running successfully you can see Spring banner in terminal).
	4. Open browser (Mozila preferred) and type http://localhost:8080/book/searchbytitle?title=algorithm&nor=10.
	5. Here title is a request parameter for which book would be searchable and nor is number of rows that number of rows/record links user wants to see.
	6. You can see JSON response with Title, ReaderLink (To read searched books) and publisher.
	

To Use/run as a Maven/Spring project =>
	1. Go to https://github.com/sudhirlthr/Digital-Library-REST-Api by opening your browser.
	2. Click download option or clone project into local repository.
	3. Extract it.
	4. Open IDE (STS/Eclipse), go File Menu->Import->expand maven->Choose "Existing Maven project"-> clack next.
	5. Click browse button and navigate to the folder where you have extracted downladed zip file.	
	6. Choose Digital-Library folder and then click finish (wait for some time so that all dependency get downloaded).
	7. Right click on imported project => RunAs => Java Application => type DigitalLibraryApplication => click /choose suggested class and then click ok.
	8. You can see Spring Banner on console.
	9. Open browser (Mozila preferred) and type http://localhost:8080/book/searchbytitle?title=algorithm&nor=10.
	10. Here title is a request parameter for which book would be searchable and nor is number of rows that number of rows/record links user wants to see.
	11. You can see JSON response with Title, ReaderLink (To read searched books) and publisher.

