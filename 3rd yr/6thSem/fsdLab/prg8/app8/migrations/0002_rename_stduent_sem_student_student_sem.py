# Generated by Django 5.0.6 on 2024-07-05 03:31

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('app8', '0001_initial'),
    ]

    operations = [
        migrations.RenameField(
            model_name='student',
            old_name='stduent_sem',
            new_name='student_sem',
        ),
    ]