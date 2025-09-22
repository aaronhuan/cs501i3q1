CS501 Individual Assignment 3 Question 1 

# Overview
The main code creates a Row that wraps around the entire code sample.
Inside the Row, I created 2 sections that take up 25% and 75% respectively.
Then inside the 75% section, I created a Column that has 3 sections that split the screen 2:3:5.

## How it works
- Used Modifier.fillMaxSize() to fill the entire screen. 
- Used Modifier.fillMaxWidth() to fill the width of the screen (for sections inside the row).
- Used Modifier.fillMaxHeight() to fill the height of the screen(for sections inside the column).
- The Row uses `.weight(1f)` and `.weight(3f)` to split width 25/75
- The `Column` inside the 75% pane has children with weights `2f`, `3f`, `5f`.
- Colors, borders, and labels visualize space usage.

## Running
Open the project in Android Studio (Giraffe+), run on an emulator or device with minSdk appropriate to your template.
