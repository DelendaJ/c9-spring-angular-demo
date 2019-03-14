# Angular Spring Boot C9 demo

### Cloud 9 Setup
Create a new workspace called TDD-Animals

Once you start your workspace is created in terminal run this script
```
sh -e c9-setup-script.txt
```

### Install Node

#### Step 1
```$xslt
nvm install node
```

#### Step 2
```$xslt
npm install -g npm
```

#### Step 3
```$xslt
npm install -g @angular/cli
```

#### Step 4
```$xslt
cd src/main/angular/ui/
```

#### Step 5
```$xslt
npm install
```

#### Step 6
```$xslt
ng update @angular/cli
```

#### Step 7
```$xslt
npm install typescript@">=3.1.1 <3.3" --save
```

#### Step 8
```$xslt
cd ../../../../
```

### Build and Run

```$xslt
mvn spring-boot:run
```