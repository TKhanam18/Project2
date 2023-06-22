Feature: Verify Region setting functionality

Scenario Outline: Verify Region setting  functionality of Alibaba

Given I am in landing page
When I input data into search box <rownumber>
And I click the search icon


 Examples: 
|rownumber|
| 0       |
| 1       |
| 2       |