# ReactJS  Challenge
A responsive card ui based design, to be implemented by React &amp; Redux

## Introduction 
In this challenge, you are going to develop a reactJS responsive web application which shows a 
random card on the page and has a 'Try' button. Whenever the user clicks on the 'Try' button, 
you should show him another card. (Order of the cards does not matter).

Each card has at least 2 items:
- title
- description

We have different Cards which are shown differently:

- **Picture Card** which shows a picture at the end of card content (code is 0)
- **Animated Card** which uses a special animation when it is shown (code is 1) (Use a good animation of your choice)
- **Sound Card** which plays a sound when the card is shown (code is 2)

Cards can be shown in different themes (meaning they are based on a different template), icon and color representing their tag:

- sport
- art
- fun

You can choose your desired template, icon and color for each theme.

Use the following URL to initialize the card list: [https://raw.githubusercontent.com/AmirrezaRotamian/Technical-Challenges/master/tempelate.json](https://raw.githubusercontent.com/AmirrezaRotamian/Technical-Challenges/master/tempelate.json).
Application state and data, fetched from the server, should be managed by **Redux**.
Write your unit tests using **Jest** for at least your reducer(s) and action generators. Use unit test best practices at your own discretion.

User is able to edit the title and description text on the cards and save it (just saved it locally, 
no need to send the saved data to the server). After hitting 'Try' button several times, when visiting the 
same card again: the saved text should be shown instead of the original server text (for both title and description).

## Expectations

1. We expect a **clean**, **readable** and **maintainable** code with **meaningful comments**.
2. It would be better if the project uses a **bundle tools** like **Webpack** or parcel.
3. Although this is a small test project, complete it with the **mindset of a big project**. (then **structres** and **naming** of the files are very important)
4. As mentioned above it is more valuable to us that the project comes with **unit tests**

## Task

1. Either clone or private fork this repository (if you don't know how to do that, Google is your friend)
2. Develop the given challenge
3. Commit and Push your code to your new repository
3. Send us an email and notify us of completion! We'll take care about the rest and get back to you.
### Code Quality

Integrate your project with [codacy](http://codacy.com/). We do like to see your code quality, coverage and branch report. You'll need to setup code analysis and coverage report at codacy.

**Please do not start development before getting a confirmation from us**.

Happy Coding! ✊🏻