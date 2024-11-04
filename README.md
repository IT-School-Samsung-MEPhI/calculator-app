# MyCalculator App

Этот проект представляет собой простой калькулятор, реализованный с использованием View. Здесь описаны основные компоненты интерфейса, их атрибуты и назначение.

## Структура макета

### LinearLayout

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical" />
```

- **xmlns:android** и **xmlns:tools**: пространства имен для атрибутов Android и инструментов разработки.
- **layout_width** и **layout_height**: устанавливают ширину и высоту макета на полное заполнение доступного пространства.
- **orientation**: задает вертикальную ориентацию элементов внутри LinearLayout.

### TextView

```xml
<TextView
    android:id="@+id/text_res"
    android:layout_width="match_parent"
    android:layout_height="0dp"
    android:layout_weight="3"
    android:gravity="end|center_vertical"
    android:textSize="24sp" />
```

- **id**: уникальный идентификатор для доступа к элементу из кода.
- **layout_width**: ширина элемента устанавливается на полное заполнение родительского элемента.
- **layout_height**: высота устанавливается в 0dp, что позволяет использовать layout_weight для распределения пространства.
- **layout_weight**: значение 3 означает, что этот элемент займет 3/8 высоты родительского LinearLayout, поскольку у него есть 5 весов (3 + 5 = 8).
- **gravity**: выравнивание текста по правому краю и по центру вертикально.
- **textSize**: размер текста устанавливается на 24sp.

### GridLayout

```xml
<GridLayout
    android:layout_width="match_parent"
    android:layout_height="0dp"
    android:layout_gravity="bottom"
    android:layout_weight="5"
    android:columnCount="4"
    android:rowCount="4" />
```

- **layout_width** и **layout_height**: ширина устанавливается на полное заполнение родительского элемента, высота - на 0dp для использования веса.
- **layout_gravity**: размещает GridLayout внизу родительского LinearLayout.
- **layout_weight**: значение 5 указывает, что этот элемент займет 5/8 высоты родительского LinearLayout.
- **columnCount** и **rowCount**: задают количество колонок и строк в сетке, в данном случае 4 на 4.

### Button

```xml
<Button
    android:id="@+id/button_7"
    style="@style/ButtonStyle"
    android:layout_rowWeight="1"
    android:layout_columnWeight="1"
    android:text="@string/seven_button_text"
    tools:ignore="VisualLintButtonSize" />
```

- **id**: уникальный идентификатор для доступа к элементу из кода.
- **style**: применение стиля к кнопке для единообразного оформления.
- **layout_rowWeight** и **layout_columnWeight**: оба установлены на 1, что означает, что кнопка займет равную долю пространства в строке и колонне (в итоге кнопки будут равномерно распределены в GridLayout).
- **text**: текст, отображаемый на кнопке, берется из ресурсов строк (@string/seven_button_text).
- **tools:ignore**: используется для игнорирования предупреждений инструментов разработки.