# SLMTest
Software Lifecycle Management
Imperial API
Britain thinks about reusing their old imperial measurements. Your client wants you to write an API that converts imperial values to metric ones.
• Ounce to Gram
• Stone to Kilogram
Project
You should implement a REST-based server in Java (use Spring Boot). The service should be able to return the desired information using REST.
Requirements
Use GitHub or Azure DevOps for the project and follow the correct DevOps procedure. Use a Kanban board to manage your User Stories and use a git branching model (preferable gitflow) to manage your code. Track your development process by updating your Kanban board and write at least one unit tests for every requirement. A Continuous Integration pipeline that produces the finished software artifact should be implemented as well. Document
• the whole process
• the user stories
• the repository URL
• the usage of the software
in a Readme file with explanatory text. Submit the code (including the .git folder and ALM files) as a zip file (please put the Readme inside the zip file).
You can use external resources as long as you mark them: “ // taken from: <URL> ”
Points
• Documentation of the process: 15%
• Requirement definitions (User Stories): 15%
• Correct status / Linking / Branching (Kanban, Git): 15%
• Implementation: 15%
• Testing: 15%
• Pipeline (Continuous Integration and Maven): 15%
• Artefacts (Continuous Delivery): 10%
All elements must be present in the documentation.
References
Ounce to Gram → oz * 28.35 = g
Stone to Kilogram → st * 6.35 = kg
Route Examples:
api/gram?ounce=1 → 28.35
api/kilogram?stone=1 → 6.35
