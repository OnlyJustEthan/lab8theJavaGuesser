# lab8theJavaGuesser
Algorithm For The Guess A Number Game, Now Caffeine Infused

## Includes
```
Java Utils
```

## Methods

Main Menu()

```
Print option 0: Exit
Print option 1: Human is Guessing
Print option 2: Computer is Guessing
if/elif valid option:
  Start that function/exit
else:
  "Invalid option, please try again"
```


Machine Guesser()
```

```

Human Guesser()
```
Create var for name
Store result of "Hello, what is your name?"
"Nice to meet you name, let's play a game."
Generate and store random number.
Create int for player guess.
Set turn counter to 0.
Loop(keepGoing)
  Increment turn counter.
  "Turn(Turn), please guess a number."
  if guess is correct:
    "You got it!"
    keepGoing = False
  elif guess is too high:
    "Too high"
  else:
    "Too low"
if turn counter less than 7:
  print "Wow, you nailed that!"
elif turn counter equal to 7:
  print "Not bad, not bad."
else:
  print "Rough time huh? It's ok, next time you got this."

```
