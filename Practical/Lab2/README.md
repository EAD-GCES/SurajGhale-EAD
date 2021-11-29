# Lab 2 - Contributing to Open Source Project
This lab focuses on how to prepare and contribute to Open Source Project.

The following are the steps to help contributing to Open Source Project

## Forking repository
By clicking the fork button on the project's page, a copy of the repository is made.

## Cloning repository
First redirect to forked repository, clicking on code button and then clicking the copy to clipboard icon, will copy the repository url.
Now opening the terminal and run the following git command
```bash
git clone git@github.com:thenepaligamer/EAD-7th-sem.git
```

## Creating branch
Now a new branch is created using the following command
```bash
git checkout -b branch-name
```

Example
```bash
git checkout -b devsda1
```

## Now neccessary changes are made and are committed
Now neccessary changes are made, and these changes are added to the branch using the following command
```bash
git add edited-file
```

Example
```bash
git add README.md
```
OR
```bash
# adds all file 
git add .
```

Now these changes are committed using following command
```bash
git commit -m "Commit message"
```

## Pushing changes 
The changes commited are now pushed into the GitHub using following command
```bash
git push origin branch-name
```

## Submitting changes for review
Now in your repository, Compare & pull request button can be seen, clicking on that will redirect to Open a pull request, where you can submit the pull request. The owner/maintainer will then review and can merge the changes into master branch of the project. 

## Additional Material
[Here](https://github.com/firstcontributions/first-contributions) is an excellent guide to help people to learn about first contribution to open-source projects
