# Wan Si Zheng - Project Portfolio Page

## Project: PlanITarium

<!-- this is placeholder description -->
PlanITarium is a CLI application that helps you and your family to track your finances. It is written in Java, and has
about 9k LoC.
<!-- this is placeholder description -->

Given below are my contributions to the project.

* **Code
  Contributed**: [RepoSense Link](https://nus-cs2113-ay2122s2.github.io/tp-dashboard/?search=T10&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~functional-code~test-code~other&since=2022-02-18&tabOpen=true&tabType=authorship&tabAuthor=1szheng&tabRepo=AY2122S2-CS2113T-T10-2%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code~other&authorshipIsBinaryFileTypeChecked=false)

<p></p>

* **New Feature**: Added user input parsing.
    * Functionality: The parser methods that retrieves the parameters from the user's input and assists in correcting
      incorrect input format by providing feedback messages and warnings.
    * Justification: This feature improves the product significantly as a user can make mistakes when entering commands.
      The application should provide understandable and descriptive messages to assist in the corrections.
    * Highlights: This feature required an in-depth analysis on the user's possible undesirable inputs and deciding if
      such input should be blocked or given a warning. Its implementation then required much research and testing (e.g.
      learning regex) as there exists methods provided by Java that are misleading in its description and usage.

<p></p>

* **New Feature**: Added user input validation.
    * Functionality: The parser methods that helps to ensure that the user's inputs are valid.
    * Justification: This feature improves the product as a user can make mistakes when entering commands. Such methods
      are consolidated in the Parser class for ease of access, modification and addition by developers.
    * Highlights: This feature requires information and cooperation from the various command implementations, and
      affects future implementations in the same manner.

<p></p>

* **New Feature**: Added category enumeration.
    * Functionality: The enumeration of expenditure categories that allow users to tag their expenditures by using the
      number labels assigned to each category.
    * Justification: This feature improves the product as it allows advanced users to better manage their expenditure by
      categorizing them. Enumeration is used over the alternatives as the application currently does not allow for
      customized categories.
    * Highlights: This enhancement affects future commands or features that wish to extend the usage for the
      categorizing of expenditures.
