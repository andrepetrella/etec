var nums = [];
for (let i = 1; i < 4; i++) {
    let num = parseFloat(prompt("Insira o valor " + (i) + ": "));
    nums[i] = num;
}

if (nums[1] > nums[2] && nums[2] > nums[3]) {
    console.log(nums[1] + " > " + nums[2] + " > " + nums[3]);
} else if (nums[1] > nums[3] && nums[3] > nums[2]) {
    console.log(nums[1] + " > " + nums[3] + " > " + nums[2]);
} else if (nums[2] > nums[1] && nums[1] > nums[3]) {
    console.log(nums[2] + " > " + nums[1] + " > " + nums[3]);
} else if (nums[2] > nums[3] && nums[3] > nums[1]) {
    console.log(nums[2] + " > " + nums[3] + " > " + nums[1]);
} else if (nums[3] > nums[2] && nums[2] > nums[1]) {
    console.log(nums[3] + " > " + nums[2] + " > " + nums[1]);
} else if (nums[3] > nums[1] && nums[1] > nums[2]) {
    console.log(nums[3] + " > " + nums[1] + " > " + nums[2]);
} else {
    console.log("Erro");
}
