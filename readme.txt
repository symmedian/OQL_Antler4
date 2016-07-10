Antler project!

To generate Parser + Lexer in src directory:

org.antlr.v4.Tool
    -o /Users/jantaljaard/IdeaProjects/Antler/src
    /Users/jantaljaard/IdeaProjects/Antler/src/resources/Oql.g4


To generate Parser + Lexer in com/symmedian/antlr directory:

org.antlr.v4.Tool
    -package com.symmedian.antlr
    -o /Users/jantaljaard/IdeaProjects/Antler/src/com/symmedian/antlr
    /Users/jantaljaard/IdeaProjects/Antler/src/resources/Oql.g4

To run GUI (expects the source to be in project root directory!!)
org.antlr.v4.gui.TestRig  Oql
                          whereclause
                          -gui
                          -input
                          /Users/jantaljaard/IdeaProjects/Antler/src/resources/sample3.oql