class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        x = 0
        for i in stones:
            for j in jewels:
                if i == j:
                    x=x+1
        return x

        