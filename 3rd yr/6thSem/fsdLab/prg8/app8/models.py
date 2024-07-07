from django.db import models

# Create your models here.
class Course(models.Model):
    course_code = models.CharField(max_length=14, unique=True)
    course_name = models.CharField(max_length=70)
    course_credits = models.IntegerField()
    
    def __str__(self):
        return self.course_code + " (" + self.course_name + ")"
    
class Student(models.Model):
    student_usn = models.CharField(max_length=10, unique=True)
    student_name = models.CharField(max_length=80)
    student_sem = models.IntegerField()
    enrolment = models.ManyToManyField(Course)