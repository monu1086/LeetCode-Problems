SELECT score,
DENSE_RANK() OVER (ORDER BY score DESC) AS 'rank'
from ScoreS
ORDER BY score DESC;