def highest_altitude(n, heights):
    altitude = 0
    max_altitude = 0
    
    for height in heights:
        altitude += height
        max_altitude = max(max_altitude, altitude)
        
    return max_altitude
n = int(input())
heights = list(map(int, input().split()))
print(highest_altitude(n,heights))
