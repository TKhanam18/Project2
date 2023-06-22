Feature: Language and Currency Verification Functionality
Scenario: Language and Currency Verification

Given We are on the landing page
When We mouseHover on Region setting
And We click on language dropdown menu
And we click on Hindi
And we click on currency dropdown menu
Then we click on save button
Then we verify the new language