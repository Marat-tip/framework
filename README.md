### What is the vision of this framework?

- Usage of kotlin dsl instead of annotations
- Usage of profiles and different configuration properties
- What about properties in .kt files?

#### Framework core

- IOC container
    - component - manged by framework class
    - component definition - description of class, it's dependencies and so on
    - definition provider - component who is responsible for providing definitions of components to be created
        - e.g. KotlinDSLComponentDefinitionProvider
    - component factory - creation of component by component definition
    - application context - responsible for component management
