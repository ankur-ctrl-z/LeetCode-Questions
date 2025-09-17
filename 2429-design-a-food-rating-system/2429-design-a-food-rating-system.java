class FoodRatings {
    private static class Food{
        String name;
        int rating;

        Food(String name, int rating){
            this.name = name;
            this.rating = rating;
        }
    }
    private Map<String, PriorityQueue<Food>> cousinePQ = new HashMap<>();
    private Map<String, String> foodCousine = new HashMap<>();
    private Map<String, Integer> foodRating = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i = 0; i < foods.length; i++){
            String food = foods[i];
            String cousine = cuisines[i];
            int rating = ratings[i];

            foodCousine.put(food, cousine);
            foodRating.put(food, rating);
            cousinePQ.computeIfAbsent(cousine, k -> new PriorityQueue<>(
                (a,b) -> a.rating != b.rating ? b.rating - a.rating : a.name.compareTo(b.name)
            )).offer(new Food(food, rating));
        }
    }
    
    public void changeRating(String food, int newRating) {
        String cousine = foodCousine.get(food);
        foodRating.put(food, newRating);
        cousinePQ.get(cousine).offer(new Food(food, newRating));
    }
    
    public String highestRated(String cuisine) {
        PriorityQueue<Food> pq = cousinePQ.get(cuisine);

        while(true){
            Food food = pq.peek();
            if(food.rating == foodRating.get(food.name)){
                return food.name;
            }
            pq.poll();
        }
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */