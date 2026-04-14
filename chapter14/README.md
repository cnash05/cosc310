Part 1: Brief Proposal
    Question 1: "When did the rider experience the highest combined heart rate and elevation levels during the week?"
    For each trackpoint, I will calculate the metric: total = heartRate x altitude. This represents when the rider's heart rate is high and when they are riding at high elevations. Both variables will be sorted in descending order using all 4 days of data.  Then the top 10 will be chosen as the result. 

    Question 2: "How can I find the timestamps where the rider’s heart rate was within the range of 150 bpm or greater?"
    I will sort the data by heart rate. Afterwards, I will use a binary search to find the first point the heart rate is greater than or equal to 150bpm.  The code should then iterate to find all other matches.

Part 2: Justifications
    Sorting Algorithm: I chose MergeSort to organize the data because it is a large amount of data and it would be efficient. Some of the other algorithms would be too slow due to the dataset having so many records.  The Merge Sort worked by recursively dividing it into smaller sublists and sorting them before combining them back together in order. I chose Merge Sort because I knew it would work no matter the order of the data.  The time complexity was O(n log n). The space complexity was O(n).

    Searching Algorithm: I chose Binary Search to find all records where the heart rate was equal to or above 150 bpm. The data was first sorted by heart rate and then Binary Search was run. It worked by dividing the data in half repeatedly to find the first value of >= 150 bpm.  Once the Search found the first matching point, the program goes through remaining records to find the rest of the matches. It works faster than a linear search because the dataset was bigger so I chose Binary Search.  The time complexity was O(log n) to find the first match and O(k) to get matching results. The space complexity was O(1). 

Part 3: Final Output 
    Total records loaded from all 4 days: 223983

    QUESTION 1: TOP 10 HIGHEST COMBINED (heartRate × altitude) ===
    1. UTC: 2026-03-10T06:51:57Z | HR:131 | Alt:171.4 | Combined:22453.398 | Speed:9.104400157928467 km/h
    2. UTC: 2026-03-10T06:51:58Z | HR:129 | Alt:171.6 | Combined:22136.4 | Speed:9.33840036392212 km/h
    3. UTC: 2026-03-10T06:51:56Z | HR:129 | Alt:171.2 | Combined:22084.799 | Speed:9.439199924468994 km/h
    4. UTC: 2026-03-10T06:51:55Z | HR:125 | Alt:171.2 | Combined:21400.0 | Speed:9.104400157928467 km/h
    5. UTC: 2026-03-09T20:18:01Z | HR:135 | Alt:157.0 | Combined:21195.0 | Speed:23.075999450683593 km/h
    6. UTC: 2026-03-10T06:51:59Z | HR:123 | Alt:171.8 | Combined:21131.4 | Speed:9.237599945068359 km/h
    7. UTC: 2026-03-09T20:18:02Z | HR:134 | Alt:157.0 | Combined:21038.0 | Speed:23.58000068664551 km/h
    8. UTC: 2026-03-09T20:17:59Z | HR:134 | Alt:156.8 | Combined:21011.201 | Speed:22.539600563049316 km/h
    9. UTC: 2026-03-09T20:18:00Z | HR:134 | Alt:156.8 | Combined:21011.201 | Speed:22.975199890136718 km/h
    10. UTC: 2026-03-09T20:18:03Z | HR:133 | Alt:157.0 | Combined:20881.0 | Speed:23.24519920349121 km/h

    QUESTION 2: TIMESTAMPS WHERE HEART RATE >= 150 bpm ===
    Total points found: 98
    First 15 matches:
    UTC: 2026-03-11T17:57:34Z | HR:150 | Alt:33.0 | Combined:4950.0 | Speed:23.479199409484863 km/h
    UTC: 2026-03-11T17:57:33Z | HR:150 | Alt:33.2 | Combined:4980.0 | Speed:23.277600288391113 km/h
    UTC: 2026-03-11T17:56:04Z | HR:150 | Alt:27.6 | Combined:4140.0 | Speed:14.580000686645509 km/h
    UTC: 2026-03-11T17:57:32Z | HR:151 | Alt:33.4 | Combined:5043.4004 | Speed:23.81399917602539 km/h
    UTC: 2026-03-11T17:57:24Z | HR:151 | Alt:33.4 | Combined:5043.4004 | Speed:25.023600769042968 km/h
    UTC: 2026-03-11T17:57:23Z | HR:151 | Alt:33.4 | Combined:5043.4004 | Speed:24.084000205993654 km/h
    UTC: 2026-03-11T17:57:22Z | HR:151 | Alt:33.4 | Combined:5043.4004 | Speed:24.18479976654053 km/h
    UTC: 2026-03-11T17:56:39Z | HR:151 | Alt:34.2 | Combined:5164.2 | Speed:15.18120002746582 km/h
    UTC: 2026-03-11T17:56:12Z | HR:151 | Alt:29.2 | Combined:4409.2 | Speed:13.031999588012695 km/h
    UTC: 2026-03-11T17:56:11Z | HR:151 | Alt:29.2 | Combined:4409.2 | Speed:14.14079990386963 km/h
    UTC: 2026-03-11T17:57:31Z | HR:152 | Alt:33.4 | Combined:5076.8003 | Speed:25.192800521850586 km/h
    UTC: 2026-03-11T17:57:28Z | HR:152 | Alt:33.6 | Combined:5107.1997 | Speed:24.757199478149413 km/h
    UTC: 2026-03-11T17:57:27Z | HR:152 | Alt:33.6 | Combined:5107.1997 | Speed:25.394399642944336 km/h
    UTC: 2026-03-11T17:57:26Z | HR:152 | Alt:33.6 | Combined:5107.1997 | Speed:25.596000480651856 km/h
    UTC: 2026-03-11T17:57:25Z | HR:152 | Alt:33.4 | Combined:5076.8003 | Speed:24.82199993133545 km/h