echo "limit:"
read limit
#read array
for((i=0;i<limit;i++))
do
echo "enter the elements$((i+1)):"
read a[i]
done
#sort elements
sorted=($(sort <<< "${a[*]}"))
#sorted
echo "The sorted array is:"
for element in "${sorted[@]}"
do
    echo "$element"
done
