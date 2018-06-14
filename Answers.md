1) What is the complexity of each of the four search methods in terms of array or list size n?
Answer:
1. findTeamPosition array - O(n)
2. findTeamPosition list - O(n)
3. findTeamMinFunding - O(n)
4. findTeamMinFundingFast - O(log2(n))


2) What happens in the case of binary search if the array is not sorted?
Answer:
Binary search won't work if the array is not sorted.
That means it may not find the key value in the array even if the key is present in the array.


3) What is the purpose of constructor argument validity checking?
Answer:
Team is a collection of team name, headcoach and funding.
If we want to represent Team then we need these three values.
So, If any of string value is null or funding is -1 then
It is like a hole in representing the Team.
So, we have to validate the three values in constructor.


4) What is the purpose of using the keyword final with variables and arguments?
Answer:
final with variables and arguments is used to represent the constant.
value of constant variables never change.


5) What are alternatives to using Optional and how do they compare?
Answer:
Alternatives to using Optional is returning the index value (int type) itself.
So that we can compare easily.

